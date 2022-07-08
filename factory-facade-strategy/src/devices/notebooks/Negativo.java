package src.devices.notebooks;

import src.Device;

public class Negativo extends Device{
    private String cpu;
    private int hdd;

    public Negativo (String cpu, int hdd){
        this.cpu = cpu;
        this.hdd = hdd;
    }
    
    @Override
    public String getDetails(){
        return "Negativo cpu: " + this.cpu + ", and " + this.hdd + "GB of hdd.";
    }

    @Override
    public String toString(){
        return "Negativo{" +
                "cpu:'" + cpu + '\'' +
                ", hdd:'" + hdd + '\'' +
                '}';
    }

}
