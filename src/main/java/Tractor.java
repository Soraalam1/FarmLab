import java.util.ArrayList;

public class Tractor implements FarmVehicle {

    String name;

    public Tractor(String name) {
        this.name = name;
    }

    public void operate(){
        System.out.println(name + " is doing work on the farm");
    }

    public void makeNoise() {
        System.out.println("tractor noises");
    }

    public Tractor() {
    }

    @Override
    public String toString() {
        return "Tractor";
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
