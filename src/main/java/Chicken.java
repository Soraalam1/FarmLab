public class Chicken implements Animal, Produce {
    private boolean hasBeenFertilized;

    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Chicken() {

    }

    public void makeNoise() {
        System.out.println("cluck cluck");
    }

    public void eat(Edible object) {
        System.out.println(object + "om nom nom");
    }

    public EdibleEgg yield() {
        if (!hasBeenFertilized) {
            return new EdibleEgg(); //return a new edibleEgg constructor
        }else {return null;
        }
    }

    public void eat(String corn) {
    }
}
