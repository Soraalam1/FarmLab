import java.util.ArrayList;

public class CropDuster implements FarmVehicle, Aircraft {

    public CropDuster() {
    }

    public void fly() {
        System.out.println("Flying");
    }

    public void makeNoise(){
        System.out.println("loud humming");
    }

    public void operate(){
        System.out.println("Spraying Crops");
    }


    public void fertilize(CropRow cropRow){
        System.out.println("Fertilizing Crop Row");
        ArrayList<Crop> list = cropRow.getListOfCrops();
        for (int index = 0; index < list.size(); index++ ){
            list.get(index).fertilize();

        }
    }
}
