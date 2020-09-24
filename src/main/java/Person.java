public class Person implements Rider{

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void makeNoise(){
        System.out.println(this.getName() + " is talking ");
    }
    public void eat(Edible object){
        System.out.println(this.getName() + " is eating " + object);
    }
    public void mount(Rideable object){
        System.out.println(this.getName() + " has mounted " + object);
    }


    public void dismount(Rideable object){
        System.out.println(this.getName() + " has dismounted " + object);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
