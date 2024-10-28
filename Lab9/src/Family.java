import java.util.ArrayList;

public class Family {
    // Instance variables
    private ArrayList<Person> members;
    private static final int MAX_MEMBERS = 10;

    // Default constructor
    public Family() {
        members = new ArrayList<>();
    }

    // Method to display the family information
    public void display() {
        for (Person member : members) {
            System.out.println(member);
        }
    }

    // Method to add a person to the family (taking name and age as parameters)
    public boolean addPerson(String name, int age) {
        if (members.size() < MAX_MEMBERS) {
            members.add(new Person(name, age));
            return true;
        } else {
            return false; // No more space in the family
        }
    }

    // Method to handle a birthday
    public void birthday(String name) {
        for (Person member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                member.incrementAge();
                break;
            }
        }
    }

    // Accessor method to return the number of people
    public int getNumberOfPeople() {
        return members.size();
    }

    // Accessor method to return the total age of the people
    public int getTotalAge() {
        int totalAge = 0;
        for (Person member : members) {
            totalAge += member.getAge();
        }
        return totalAge;
    }
}
