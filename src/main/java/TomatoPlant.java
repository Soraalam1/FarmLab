public class TomatoPlant extends Crop{
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public TomatoPlant(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        this.hasBeenHarvested = hasBeenHarvested;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    @Override
    public Tomato yield() {
        if (hasBeenFertilized) {
            System.out.println("Tomato harvested!");
            setHasBeenHarvested(true);
            return new Tomato();
        } else {
    return null;
        }

    }
}
