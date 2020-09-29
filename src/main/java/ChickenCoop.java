import java.util.ArrayList;

public class ChickenCoop {

    private String name;
    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();


    public ChickenCoop(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "Chickens in " + this.getName() + ": " + chickens;
    }

}
