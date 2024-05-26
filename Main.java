import animals.*;
import java.util.ArrayList;  

public class Main {
    public static void main(String[] args) {
        // Create an instance of Shelter
        Shelter shelter = new Shelter();

        // Creating initial four instances of Animal
        Animal animal1 = new Animal("Leo", 5, "Lion");
        Animal animal2 = new Animal("Ella", 3, "Elephant");
        Animal animal3 = new Animal("Milo", 2, "Monkey");
        Animal animal4 = new Animal("Zara", 4, "Zebra");

        // Adding initial animals to the shelter
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

        // Dynamically creating and adding twenty more instances of Animal
        for (int i = 0; i < 20; i++) {
            Animal animal = new Animal("Animal" + (i + 5), i % 10 + 1, "Species" + (i + 5));
            shelter.addAnimal(animal);
        }

        // Removing all animals from the shelter
        for (Animal animal : new ArrayList<>(shelter.getAnimals())) {
            shelter.removeAnimal(animal);
        }

        // Removing all caretakers from the shelter
        for (Caretaker caretaker : new ArrayList<>(shelter.getCaretakers())) {
            shelter.removeCaretaker(caretaker);
        }

        // Displaying final counts of adopted, dead animals and fired caretakers
        System.out.println(shelter.getAdoptedAnimals() + " has been adopted.");
        System.out.println(shelter.getDeadAnimals() + " has died because of illness or age.");
        System.out.println(shelter.getFiredCaretakers() + " has decided to leave.");
    }
}
