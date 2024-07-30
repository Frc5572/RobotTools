package org.frc5572.util.serde;

/** Indicates this item should be updated every call to `periodic()`. */
public @interface SingleSerdeItem {
    String name();
    String updateInputs();
}
