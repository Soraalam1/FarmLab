public class Horse implements IAnimal, IRideable {
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
    public void eat(IEdible object){
        System.out.println(name + " is eating " + object + " *chomp chomp*");
    }

    @Override
    public String toString() {
        return name;
    }
}
