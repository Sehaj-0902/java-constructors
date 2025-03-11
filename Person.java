public class Person {
    // Class attributes
    private String personName;
    private int personAge;

    // Default Constructor
    Person() {
        personName = "Sehaj";
        personAge = 22;
    }

    // Copy Constructor
    Person(Person previousPerson) {
        this.personName = previousPerson.personName;
        this.personAge = previousPerson.personAge;
    }

    // Method to display person details
    void personDetails() {
        System.out.println("Person's Name: " + personName);
        System.out.println("Person's Age: " + personAge);
    }

    public static void main(String[] args) {
        // Default Constructor
        Person person1 = new Person();
        System.out.println("Default Person Details");
        person1.personDetails();

        // Copy Constructor
        Person person2 = new Person();
        System.out.println("Cloned Person Details");
        person2.personDetails();
    }
}

/*
Output:
    Default Person Details
    Person's Name: Sehaj
    Person's Age: 22
    Cloned Person Details
    Person's Name: Sehaj
    Person's Age: 22
 */