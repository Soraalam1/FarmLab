import java.util.ArrayList;

public class Crop implements Produce {
   private boolean hasBeenHarvested = false;
   private boolean hasBeenFertilized = false;


   public Edible yield() {
        if(hasBeenFertilized){
            System.out.println("A crop has been yielded");
        }
    return null;
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
