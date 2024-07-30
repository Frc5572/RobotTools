package org.frc5572.util.serde;

/** Implementation for serialization/deserialization of a type. */
public interface Serialize<T> {
    
    void toTable(String name, T value);
    T fromTable(String name);

}
