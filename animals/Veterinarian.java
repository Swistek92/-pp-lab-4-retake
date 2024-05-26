package animals;

public class Veterinarian extends Caretaker {

    // Constructor
    public Veterinarian(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    // Override takeCare method
    @Override
    public void takeCare() {
        System.out.println("Doctor " + getFirstName() + " " + getLastName() + " is treating animals.");
    }
}