import java.util.ArrayList;

public class Farm {
    ArrayList<Stable> stables = new ArrayList<Stable>();
    ArrayList<ChickenCoop> coops = new ArrayList<ChickenCoop>();
    FarmHouse ourFarmHouse = new FarmHouse();
    Field field;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> coops, FarmHouse ourFarmHouse) {
        this.stables = stables;
        this.coops = coops;
        this.ourFarmHouse = ourFarmHouse;
    }
}
