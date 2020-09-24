public class TomatoPlant extends Crop{
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Tomato yield() {
        if (hasBeenFertilized) {
            System.out.println("Tomato created");
            return new Tomato();
        } else {
    return null;
        }

    }
}
