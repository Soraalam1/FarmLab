public class Person implements IRider{

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
    public void eat(IEdible object){
        System.out.println(this.getName() + " is eating " + object);
    }
    public void mount(IRideable object){
        System.out.println(this.getName() + " has mounted " + object);
    }
    public void ride(IRideable thing){
        System.out.println(name + " is riding " + thing + ".");
    }


    public void dismount(IRideable object){
        System.out.println(this.getName() + " has dismounted " + object);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
