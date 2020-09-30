public class Farmer extends Botanist {

    public Farmer(String name) {
        super(name);
    }


    @Override
    public void makeNoise(){
        System.out.println("Howdy, My name is " + name +" & I'm a Farmer!");
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                '}';
    }
}
