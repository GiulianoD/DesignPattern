package src.factory;

import src.AbstractDeviceFactory;
import src.Device;
import src.devices.mobiles.Sansung;
import src.devices.mobiles.Xiaome;
import src.enums.DeviceType;

public class MobileFactory extends AbstractDeviceFactory{
    @Override
    public Device getGadget(DeviceType type){
        switch (type){
            case SANSUNG:
                return new Sansung("A01", 32);
            case XIAOME:
                return new Xiaome("Mi A1", 124000);
            default:
                break;
        }
        return null;
    }
}
