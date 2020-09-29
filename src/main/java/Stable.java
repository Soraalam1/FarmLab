import java.util.ArrayList;

public class Stable {
    ArrayList<Horse> horses = new ArrayList<Horse>();

    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public Stable() {

    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Stable{" +
                "horses=" + horses +
                '}';
    }
}
