import java.util.ArrayList;

public class Tractor implements FarmVehicle {
    public void operate(){
        System.out.println("Tractor is doing work on the farm.");
    }

    public void makeNoise() {
        System.out.println("Noise");
    }

    public void harvestCropRow (CropRow harvestedCropRow){
        System.out.println("Harvesting crops");
        ArrayList<Crop> list = harvestedCropRow.getListOfCrops();
        for (int index = 0; index < list.size(); index++ ){
            list.get(index).harvest();
            if (list.get(index).isHasBeenFertilized()){
                list.get(index).yield();
                list.get(index).harvest();
            }
        }
    }
}
