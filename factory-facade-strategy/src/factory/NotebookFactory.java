package src.factory;

import src.AbstractDeviceFactory;
import src.Device;
import src.devices.notebooks.Del;
import src.devices.notebooks.Negativo;
import src.enums.DeviceType;

public class NotebookFactory extends AbstractDeviceFactory{
    @Override
    public Device getGadget(DeviceType type){
        switch (type){
            case DEL:
                return new Del("Ryzen 3 1300x", 4);
            case NEGATIVO:
                return new Negativo("Athlon 230", 500);
            default:
                break;
        }
        return null;
    }
}
