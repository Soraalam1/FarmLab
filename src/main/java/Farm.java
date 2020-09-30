import java.util.ArrayList;

public class Farm {
    private ArrayList<Stable> stables = new ArrayList<Stable>();
    private ArrayList<ChickenCoop> coops = new ArrayList<ChickenCoop>();
    private FarmHouse ourFarmHouse = new FarmHouse();
    private Field field;

    public Farm() {

    }


    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public ArrayList<ChickenCoop> getCoops() {
        return coops;
    }

    public void setCoops(ArrayList<ChickenCoop> coops) {
        this.coops = coops;
    }

    public FarmHouse getOurFarmHouse() {
        return ourFarmHouse;
    }

    public void setOurFarmHouse(FarmHouse ourFarmHouse) {
        this.ourFarmHouse = ourFarmHouse;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + stables +
                ", coops=" + coops +
                ", ourFarmHouse=" + ourFarmHouse +
                ", field=" + field +
                '}';
    }
}
