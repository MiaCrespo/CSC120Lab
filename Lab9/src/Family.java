public class Family {
    private Person[] members;         //object array
    private int numberOfPeople;       //number of people in the family
    private static final int MAX_MEMBERS = 10; //max number of family members = 10

    //constructor
    public Family() {
        members = new Person[MAX_MEMBERS]; // initializes it
        numberOfPeople = 0;
    }

    //method to add a person to the family
    public boolean addPerson(String name, int age) {
        if (numberOfPeople < MAX_MEMBERS) {
            members[numberOfPeople] = new Person(name, age); //adds a new person
            numberOfPeople++;                                //increments the count
            return true;
        } else {
            return false; //can't add more people/fam members to the array
        }
    }

    //method for birthday
    public void birthday(String name) {
        for (int i = 0; i < numberOfPeople; i++) {
            if (members[i].getName().equalsIgnoreCase(name)) {
                members[i].incrementAge(); // Increments age for the specified person
                break;                     // Stop after finding the person
            }
        }
    }

    //method to return the number of people in the family
    public int getNumberOfPeople() {
        return numberOfPeople; //returns the current number of family members
    }

    //method to return the total age of all family members
    public int getTotalAge() {
        int totalAge = 0;
        for (int i = 0; i < numberOfPeople; i++) {
            totalAge += members[i].getAge(); //adds up ages
        }
        return totalAge; //returns total age
    }

    //display family info
    public void display() {
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println(members[i]);
        }
    }
}
