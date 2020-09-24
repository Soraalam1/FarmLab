public class CornStalk extends Crop {
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public void yield() {
        EarCorn earCorn = new EarCorn();
        System.out.println("EarCorn implemented");
    }

}
