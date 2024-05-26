import animals.*;

public class Main {
    public static void main(String[] args) {
        // Creating four instances of Animal
        Animal animal1 = new Animal("Leo", 5, "Lion");
        Animal animal2 = new Animal("Ella", 3, "Elephant");
        Animal animal3 = new Animal("Milo", 2, "Monkey");
        Animal animal4 = new Animal("Zara", 4, "Zebra");

        // Displaying information about the animals
        animal1.displayInfo();
        animal2.displayInfo();
        animal3.displayInfo();
        animal4.displayInfo();

        // Setting new values for the first animal
        animal1.setName("Simba");
        animal1.setAge(6);

        // Displaying updated information about the first animal
        System.out.println("\nUpdated Animal Info:");
        animal1.displayInfo();

        // Creating an instance of Veterinarian
        Veterinarian veterinarian = new Veterinarian("John", "Doe", 101);
        veterinarian.displayInfo();
        veterinarian.takeCare();

        // Creating instances of Volunteer
        Volunteer volunteer1 = new Volunteer("Jane", "Smith", 201);
        Volunteer volunteer2 = new Volunteer("Bob", "Brown", 202);
        
        volunteer1.displayInfo();
        volunteer1.takeCare();
        
        volunteer2.displayInfo();
        volunteer2.takeCare();
    }
}