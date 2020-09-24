public class Horse implements Animal, Rideable {
    public void makeNoise(){
        System.out.println("YUUUUHHHHEEERRRR");
    }
    public void eat(Edible object){
        System.out.println(object + "chomp chomp chomp");
    }

}
