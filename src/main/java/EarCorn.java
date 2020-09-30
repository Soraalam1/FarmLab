public class EarCorn implements IEdible {
    String name;

    public EarCorn() {
        this.name = "New Earcorn";
    }

    public EarCorn(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

}
