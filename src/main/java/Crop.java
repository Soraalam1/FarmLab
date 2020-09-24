import java.util.ArrayList;

public class Crop implements Produce {
    boolean hasBeenHarvested = false;
    boolean hasBeenFertilized = false;


    void yield() {

    }

    public void fertilize(){
        this.hasBeenFertilized = true;
    }

    public void harvest(){
        this.hasBeenHarvested = true;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }
}
