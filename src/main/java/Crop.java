public interface Crop extends Produce {
    boolean hasBeenHarvested = false;
    boolean hasBeenFertilized = false;

    void yield();

}
