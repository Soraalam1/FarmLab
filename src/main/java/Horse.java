public class Horse implements Animal, Rideable {
    public void makeNoise(){
        System.out.println("Horse Noise");
    }
    public void eat(Edible object){
        System.out.println(object + "is eaten");
    }

}
