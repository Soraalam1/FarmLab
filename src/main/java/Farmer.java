public class Farmer extends Botanist {

    public Farmer(String name) {
        super(name);
    }
    @Override
    public void makeNoise(){
        System.out.println("howdy");
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                '}';
    }
}
