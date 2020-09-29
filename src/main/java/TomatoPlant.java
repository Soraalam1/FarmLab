public class TomatoPlant extends Crop{
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public TomatoPlant(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        this.hasBeenHarvested = hasBeenHarvested;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Tomato yield() {
        if (hasBeenFertilized) {
            System.out.println("Tomato created");
            return new Tomato();
        } else {
    return null;
        }

    }
}
