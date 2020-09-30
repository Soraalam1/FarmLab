import java.util.ArrayList;

public class Crop implements IProduce {
   private boolean hasBeenHarvested = false;
   private boolean hasBeenFertilized = true;


   public IEdible yield() {
        if(hasBeenFertilized){
            this.hasBeenHarvested = true;
            System.out.println("Crop harvested!");
            return null;
        }
    return null;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void fertilize(){
        this.hasBeenFertilized = true;
    }




}
