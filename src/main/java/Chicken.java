
public class Chicken implements IAnimal, IProduce {

    private String name;
    private boolean hasBeenFertilized;

    public Chicken(String name,boolean hasBeenFertilized) {

        this.name = name;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("cluck cluck");
    }

    public void eat(IEdible object) {
        System.out.println(object + "om nom nom");
    }

    public EdibleEgg yield() {
        if (!hasBeenFertilized) {
            System.out.println(this.getClass().getSimpleName() + " " + name + " is not fertilized, therefore, has laid an edible egg!");
            return new EdibleEgg(); //return a new edibleEgg constructor
        }else {
            System.out.println(this.getClass().getSimpleName() + " " + name + " is fertilized, therefore, did not lay an edible egg!");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Fertilized? " + hasBeenFertilized;
    }
}
