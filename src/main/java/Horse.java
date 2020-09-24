public class Horse implements Animal, Rideable {
    public void makeNoise(){
        System.out.println("YUUUUHHHHEEERRRR");
    }
    public void eat(Edible object){
        System.out.println(object + "chomp chomp chomp");
    }

    public void eat() {
    }

    public void eat(String hay) {
    }
}
