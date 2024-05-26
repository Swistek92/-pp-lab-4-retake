import animals.*;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Shelter
        Shelter shelter = new Shelter();

        // Creating four instances of Animal
        Animal animal1 = new Animal("Leo", 5, "Lion");
        Animal animal2 = new Animal("Ella", 3, "Elephant");
        Animal animal3 = new Animal("Milo", 2, "Monkey");
        Animal animal4 = new Animal("Zara", 4, "Zebra");

        // Adding animals to the shelter
        shelter.addAnimal(animal1);
        shelter.addAnimal(animal2);
        shelter.addAnimal(animal3);
        shelter.addAnimal(animal4);

        // Setting new values for the first animal
        animal1.setName("Simba");
        animal1.setAge(6);

        // Creating instances of Veterinarian
        Veterinarian veterinarian1 = new Veterinarian("John", "Doe", 101);
        Veterinarian veterinarian2 = new Veterinarian("Emily", "Clark", 102);

        // Creating instances of Volunteer
        Volunteer volunteer1 = new Volunteer("Jane", "Smith", 201);
        Volunteer volunteer2 = new Volunteer("Bob", "Brown", 202);
        Volunteer volunteer3 = new Volunteer("Alice", "Johnson", 203);

        // Adding caretakers to the shelter
        shelter.addCaretaker(veterinarian1);
        shelter.addCaretaker(veterinarian2);
        shelter.addCaretaker(volunteer1);
        shelter.addCaretaker(volunteer2);
        shelter.addCaretaker(volunteer3);

        // Displaying information about animals and caretakers in the shelter
        System.out.println("Animals in the Shelter:");
        shelter.displayAnimals();

        System.out.println("Caretakers in the Shelter:");
        shelter.displayCaretakers();

        // Removing an animal and caretakers from the shelter
        shelter.removeAnimal(animal1);
        shelter.removeCaretaker(veterinarian1);
        shelter.removeCaretaker(volunteer1);

        // Displaying information about animals and caretakers in the shelter after removal
        System.out.println("Animals in the Shelter after removal:");
        shelter.displayAnimals();

        System.out.println("Caretakers in the Shelter after removal:");
        shelter.displayCaretakers();
    }
}