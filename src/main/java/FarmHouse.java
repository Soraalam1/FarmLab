import java.util.ArrayList;

public class FarmHouse {
    ArrayList<Person> people = new ArrayList<Person>();

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

    @Override
    public String toString() {
        return "FarmHouse{" +
                "people=" + people +
                '}';
    }
}
