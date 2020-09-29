import java.util.ArrayList;

public class ChickenCoop {
    ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public ChickenCoop(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "chickens=" + chickens +
                '}';
    }
}
