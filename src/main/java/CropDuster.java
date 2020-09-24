public class CropDuster implements FarmVehicle, Aircraft {

    public void fly() {
        System.out.println("Flying");
    }
    public void makeNoise(){
        System.out.println("loud");
    }
    public void operate(){
        System.out.println("Spraying Crops");
    }
    public void fertilize(CropRow cropRow){
        System.out.println("Fertilizing Crop Row");
    }

}
