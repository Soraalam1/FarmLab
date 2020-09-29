import java.util.ArrayList;

public class CropDuster implements FarmVehicle, Aircraft {

    String name;

    public CropDuster() {
    }

    public CropDuster(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(name + " is flying");
    }

    public void makeNoise(){
        System.out.println("loud humming");
    }

    public void operate(){
        System.out.println(name + " is spraying Crops");
    }


    @Override
    public String toString() {
        return "CropDuster";
    }

    public void fertilize(CropRow cropRow){
        System.out.println("Fertilizing Crop Row");
        ArrayList<Crop> list = cropRow.getListOfCrops();
        for (int index = 0; index < list.size(); index++ ){
            list.get(index).fertilize();

        }

    }
}
