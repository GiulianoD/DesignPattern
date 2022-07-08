package src.devices.mobiles;

import src.Device;

public class Sansung extends Device{
    private String model;
    private int megapixels;

    public Sansung (String deviceModel, int mainCamera){
        this.model = deviceModel;
        this.megapixels = mainCamera;
    }
    
    @Override
    public String getDetails(){
        return "Sansung model: " + this.model + ", and the main camera has " + this.megapixels + "megapixels.";
    }

    @Override
    public String toString(){
        return "Sansung{" +
                "model:'" + model + '\'' +
                ", camera:'" + megapixels + '\'' +
                '}';
    }

}
