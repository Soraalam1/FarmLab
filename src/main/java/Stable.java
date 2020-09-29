import java.util.ArrayList;

public class Stable {
    private String name;
    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public Stable(String name) {
        this.name = name;
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return name + "Stable: " + horses
                ;
    }
}
