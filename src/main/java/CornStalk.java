public class CornStalk extends Crop {
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public CornStalk(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    @Override
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    @Override
    public String toString() {
        return "CornStalk{" +
                "hasBeenFertilized=" + hasBeenFertilized +
                ", hasBeenHarvested=" + hasBeenHarvested +
                '}';
    }



    @Override
    public EarCorn yield() {
        if (hasBeenFertilized) {
            System.out.println("EarCorn harvested!");
            setHasBeenHarvested(true);
            return new EarCorn();
        } else {
    return null;
        }

    }
}



