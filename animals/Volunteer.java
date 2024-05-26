package animals;

public class Volunteer extends Caretaker {

    // Constructor
    public Volunteer(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    // Override takeCare method
    @Override
    public void takeCare() {
        System.out.println("Volunteer " + getFirstName() + " " + getLastName() + " is feeding animals.");
    }
}