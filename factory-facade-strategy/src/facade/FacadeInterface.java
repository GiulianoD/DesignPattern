package src.facade;

import src.enums.DeviceType;
import src.enums.FactoryType;
import src.factory.FactoryGenerator;

public class FacadeInterface {
    private FactoryType factype;
    private DeviceType devtype;

    public FacadeInterface(DeviceType type){
        this.devtype = type;
        if (type == DeviceType.DEL || type == DeviceType.NEGATIVO){
            this.factype = FactoryType.NOTEBOOKFACTORY;
        } else {
            this.factype = FactoryType.MOBILEFACTORY;
        }
    }

    public String deviceDetails(){
        return FactoryGenerator.getFactory(factype).getGadget(devtype).getDetails();
    }

    public String deviceDetailsToString(){
        return FactoryGenerator.getFactory(factype).getGadget(devtype).toString();
    }
}
