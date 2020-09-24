public class Pilot extends Person {

    CropDuster cropDuster = new CropDuster();

    public Pilot(String name, CropDuster cropDuster) {
        super(name);
        this.cropDuster = cropDuster;

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
