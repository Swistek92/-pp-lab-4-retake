package animals;

public abstract class Caretaker {
    private final String firstName;
    private final String lastName;
    private final int id;

    // Constructor
    public Caretaker(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Abstract method takeCare
    public abstract void takeCare();

    // Display information about the caretaker
    public void displayInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("ID: " + id);
    }
}