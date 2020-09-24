public class Botanist extends Person{

    public Botanist(String name) {
        super(name);
    }
    @Override
    public void makeNoise(){
        System.out.println("I plant things");
    }
    public void eat(Edible food){

    }

    public void plant(Crop crop, CropRow croprow){
        croprow.getListOfCrops().add(crop);
        System.out.println("I planted " + crop);
    }

    @Override
    public String toString() {
        return "Botanist{" +
                "name='" + name + '\'' +
                '}';
    }
}
