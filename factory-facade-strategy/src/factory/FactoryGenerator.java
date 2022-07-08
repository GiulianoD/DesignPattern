package src.factory;

import src.AbstractDeviceFactory;
import src.enums.FactoryType;

public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType type){
        switch(type){
            case NOTEBOOKFACTORY:
                return new NotebookFactory();
            case MOBILEFACTORY:
                return new MobileFactory();
            default:
                break;
        }
        return null;
    }
}
