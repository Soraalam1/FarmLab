public class Tomato implements Edible{

    String name;

    public Tomato(){

    }
    public Tomato(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                name;
    }
}
