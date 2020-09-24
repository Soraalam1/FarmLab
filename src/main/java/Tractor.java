public class Tractor implements FarmVehicle {
    public void operate(){
        System.out.println("Tractor is doing work on the farm.");
    }

    public void makeNoise() {
        System.out.println("Noise");
    }

    public void harvest(Crop harvestedCrop){

    }
}
