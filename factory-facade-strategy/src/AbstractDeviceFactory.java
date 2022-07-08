package src;

import src.enums.DeviceType;

public abstract class AbstractDeviceFactory {
    public abstract Device getGadget(DeviceType type);
}
