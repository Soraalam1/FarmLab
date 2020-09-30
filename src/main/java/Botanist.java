public class Botanist extends Person{

    public Botanist(String name) {
        super(name);
    }
    @Override
    public void makeNoise(){
        System.out.println("I plant things");
    }

    @Override
    public void eat(Edible object){
        System.out.println(this.getName() + " is eating " + object);
    }

    public void plant(Crop crop, CropRow croprow){
        croprow.getListOfCrops().add(crop);
        System.out.println(name + " planted " + crop.getClass().getSimpleName() + " in " + croprow.getName());
    }

    @Override
    public String toString() {
        return "Botanist{" +
                "name='" + name + '\'' +
                '}';
    }
}
