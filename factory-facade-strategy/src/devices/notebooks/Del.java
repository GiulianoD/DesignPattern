package src.devices.notebooks;

import src.Device;

public class Del extends Device{
    private String cpu;
    private int ram;

    public Del (String cpu, int ram){
        this.cpu = cpu;
        this.ram = ram;
    }
    
    @Override
    public String getDetails(){
        return "Del cpu: " + this.cpu + ", and " + this.ram + "GB of RAM.";
    }

    @Override
    public String toString(){
        return "Del{" +
                "cpu:'" + cpu + '\'' +
                ", ram:'" + ram + '\'' +
                '}';
    }

}
