import java.util.ArrayList;

public class Family {
    //instance variables
    private ArrayList<Person> members; //lists to store fam members
    private static final int MAX_MEMBERS = 10; //max members is 10

    //constructor
    public Family() {
        members = new ArrayList<>();
    }

    //method to display the family info
    public void display() {
        for (Person member : members) {
            System.out.println(member);
        }
    }

    //method to add a person to the family
    //gets age and name
    public boolean addPerson(String name, int age) {
        if (members.size() < MAX_MEMBERS) {
            members.add(new Person(name, age));
            return true;
        } else {
            return false; //no more space in the family
        }
    }

    //method for birthday
    public void birthday(String name) {
        for (Person member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                member.incrementAge();
                break;
            }
        }
    }

    //method to return the number of people
    public int getNumberOfPeople() {
        return members.size();
    }

    //method to return the total age of the people
    public int getTotalAge() {
        int totalAge = 0;
        for (Person member : members) {
            totalAge += member.getAge();
        }
        return totalAge;
    }
}
