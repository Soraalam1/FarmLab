public class EarCorn implements Edible {
    String name;

    public EarCorn() {

    }

    public EarCorn(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
