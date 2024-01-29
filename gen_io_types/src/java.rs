use binrw::BinRead;

#[doc = "Enough of a Java Class to figure out its name, package and what it extends/implements"]
#[binrw::binread]
#[br(big, magic = b"\xca\xfe\xba\xbe")]
pub struct MinimalJavaClass {
    #[br(temp)]
    _minor_version: u16,
    #[br(temp)]
    _major_version: u16,
    constant_pool: ConstantPool,
    access_flags: u16,
    this_class: u16,
    super_class: u16,
    #[br(temp)]
    interfaces_count: u16,
    #[br(count = interfaces_count)]
    _interfaces: Vec<u16>,
}

#[allow(unused)]
impl MinimalJavaClass {
    pub fn this_class(&self) -> String {
        match &self.constant_pool.0[self.this_class as usize - 1] {
            ConstantPoolItem::Class { name_index } => {
                match &self.constant_pool.0[*name_index as usize - 1] {
                    ConstantPoolItem::Utf8 { value } => {
                        return value.clone();
                    }
                    x => panic!("cpool[this_class.name_index] is not a ConstantPoolItem::Utf8... Instead got {:?}", x)
                }
            },
            x => panic!("this_class is not a ConstantPoolItem::Class... Instead got {:?}", x)
        }
    }

    pub fn super_class(&self) -> String {
        match &self.constant_pool.0[self.super_class as usize - 1] {
            ConstantPoolItem::Class { name_index } => {
                match &self.constant_pool.0[*name_index as usize - 1] {
                    ConstantPoolItem::Utf8 { value } => {
                        return value.clone();
                    }
                    x => panic!("cpool[super_class.name_index] is not a ConstantPoolItem::Utf8... Instead got {:?}", x)
                }
            },
            x => panic!("super_class is not a ConstantPoolItem::Class... Instead got {:?}", x)
        }
    }

    pub fn is_public(&self) -> bool {
        (self.access_flags & 0x0001) != 0
    }

    pub fn is_interface(&self) -> bool {
        (self.access_flags & 0x0200) != 0
    }

    pub fn is_synthetic(&self) -> bool {
        (self.access_flags & 0x1000) != 0
    }

    pub fn is_annotation(&self) -> bool {
        (self.access_flags & 0x2000) != 0
    }

    pub fn is_enum(&self) -> bool {
        (self.access_flags & 0x4000) != 0
    }
}

struct ConstantPool(Vec<ConstantPoolItem>);

impl BinRead for ConstantPool {
    type Args<'a> = ();

    fn read_options<R: std::io::prelude::Read + std::io::prelude::Seek>(
        reader: &mut R,
        _endian: binrw::Endian,
        _args: Self::Args<'_>,
    ) -> binrw::prelude::BinResult<Self> {
        let cpool_count = u16::read_be(reader)?;
        let mut cpool = Vec::new();
        let mut i = 1;
        loop {
            if i >= cpool_count {
                break
            }
            let pos = reader.stream_position()?;
            let item = ConstantPoolItem::read_be(reader)?;
            let bump = match &item {
                ConstantPoolItem::Long { .. } | ConstantPoolItem::Double { .. } => 2,
                ConstantPoolItem::Skip => return Err(binrw::Error::AssertFail { pos, message: format!("Invalid Constant Pool Item.") }),
                _ => 1
            };
            cpool.push(item);
            for _ in 1..bump {
                cpool.push(ConstantPoolItem::Skip);
            }

            i += bump;
        }
        Ok(Self(cpool))
    }
}

#[doc = "Constant Pool Item enum. Defined in SE Spec sec 4.4"]
#[binrw::binread]
#[derive(Debug)]
enum ConstantPoolItem {
    #[br(magic = 7u8)]
    Class {
        name_index: u16,
    },
    #[br(magic = 9u8)]
    Fieldref {
        _class_index: u16,
        _name_and_type_index: u16,
    },
    #[br(magic = 10u8)]
    Methodref {
        _class_index: u16,
        _name_and_type_index: u16,
    },
    #[br(magic = 11u8)]
    InterfaceMethodref {
        _class_index: u16,
        _name_and_type_index: u16,
    },
    #[br(magic = 8u8)]
    String {
        _string_index: u16,
    },
    #[br(magic = 3u8)]
    Integer {
        _bytes: u32,
    },
    #[br(magic = 4u8)]
    Float {
        _bytes: u32,
    },
    #[br(magic = 5u8)]
    Long {
        _bytes: u64,
    },
    #[br(magic = 6u8)]
    Double {
        _bytes: u64,
    },
    #[br(magic = 12u8)]
    NameAndType {
        _name_index: u16,
        _descriptor_index: u16,
    },
    #[br(magic = 1u8)]
    Utf8 {
        #[br(temp)]
        length: u16,
        // Technically, Java supports CESU-8, not UTF-8, but this is close enough for now.
        #[br(count = length, try_map = |x: Vec<u8>| String::from_utf8(x))]
        value: String,
    },
    #[br(magic = 15u8)]
    MethodHandle {
        _reference_kind: u8,
        _reference_index: u16,
    },
    #[br(magic = 16u8)]
    MethodType {
        _descriptor_index: u16,
    },
    #[br(magic = 17u8)]
    Dynamic {
        _bootstrap_method_attr_index: u16,
        _name_and_type_index: u16,
    },
    #[br(magic = 18u8)]
    InvokeDynamic {
        _bootstrap_method_attr_index: u16,
        _name_and_type_index: u16,
    },
    #[br(magic = 19u8)]
    Module {
        _name_index: u16,
    },
    #[br(magic = 20u8)]
    Package {
        _name_index: u16,
    },

    Skip,
}
