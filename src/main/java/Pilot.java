public class Pilot extends Person {


    public Pilot(String name) {
        super(name);
    }

    @Override
    public void makeNoise(){
        System.out.println("I fly!");
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                '}';
    }
}
