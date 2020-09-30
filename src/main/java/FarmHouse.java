import java.util.ArrayList;

public class FarmHouse {
    ArrayList<Person> people = new ArrayList<Person>();
    ArrayList<IEdible> foodSupply = new ArrayList<IEdible>();

    public FarmHouse(ArrayList<Person> people) {
        this.people = people;
    }

    public FarmHouse() {

    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public void addFood(IEdible edible){

        foodSupply.add(edible);

    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "people=" + people +
                '}';
    }
}
