public class CornStalk extends Crop {
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;
    @Override
    public EarCorn yield() {
        if (hasBeenFertilized) {
            System.out.println("EarCorn implemented");
            return new EarCorn();
        } else {
    return null;
        }

    }
}



