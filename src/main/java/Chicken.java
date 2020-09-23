public class Chicken implements Animal, Produce {
    private boolean hasBeenFertilized;

    public void makeNoise(){
        System.out.println("Noise");
    }
    public void eat(Edible object){
        System.out.println(object + "gone");
    }

    public void Yield(){
        if(hasBeenFertilized == false){
            System.out.println(new EdibleEgg());
        }
    }
}
