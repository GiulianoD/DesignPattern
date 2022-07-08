package src;

import src.enums.DeviceType;
import src.facade.FacadeInterface;

public class ClientApplication {
    public static void main (String[] args){
        FacadeInterface query1 = new FacadeInterface(DeviceType.NEGATIVO);
        FacadeInterface query2 = new FacadeInterface(DeviceType.SANSUNG);

        System.out.println(query1.deviceDetails());
        System.out.println(query2.deviceDetailsToString());
    }
}
