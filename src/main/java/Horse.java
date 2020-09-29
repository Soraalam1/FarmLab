public class Horse implements Animal, Rideable {
    private String name;


    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("YUUUUHHHHEEERRRR");
    }
    public void eat(Edible object){
        System.out.println(object + "chomp chomp chomp");
    }

}
