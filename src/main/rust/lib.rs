use jni::{objects::{JClass, JString}, sys::jstring, JNIEnv};


#[no_mangle]
pub extern "system" fn Java_org_frc5572_robotools_RobotProcessor_run<'local>(mut env: JNIEnv<'local>, class: JClass<'local>, input: JString<'local>) -> jstring {

    

    let output = env.new_string("package org.frc5572;\n\npublic class Generated {}").unwrap();
    output.into_raw()
}
