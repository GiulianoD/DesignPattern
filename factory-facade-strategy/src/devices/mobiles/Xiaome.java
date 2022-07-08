package src.devices.mobiles;

import src.Device;

public class Xiaome extends Device{
    private String model;
    private int gpu;

    public Xiaome (String deviceModel, int megaflops){
        this.model = deviceModel;
        this.gpu = megaflops;
    }
    
    @Override
    public String getDetails(){
        return "Xiaome model: " + this.model + ", and the gpu has a performance of" + this.gpu + "megaflops.";
    }

    @Override
    public String toString(){
        return "Xiaome{" +
                "model:'" + model + '\'' +
                ", megaflops:'" + gpu + '\'' +
                '}';
    }

}
