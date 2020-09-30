import java.util.ArrayList;

public class CropRow {
    private String name;


    ArrayList<Crop> listOfCrops = new ArrayList<Crop>();
    
    public ArrayList<Crop> getListOfCrops() {
        return listOfCrops;
    }

    public void setListOfCrops(ArrayList<Crop> listOfCrops) {
        this.listOfCrops = listOfCrops;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CropRow: " + name + " contains " +
                 listOfCrops.size() + " " + listOfCrops.get(0).getClass().getSimpleName() + "s.";
    }
}
