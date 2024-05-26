package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shelter {
    private final List<Animal> animals;
    private final List<Caretaker> caretakers;

    // Constructor
    public Shelter() {
        this.animals = new ArrayList<>();
        this.caretakers = new ArrayList<>();
    }

    // Method to add an animal
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Method to add a caretaker
    public void addCaretaker(Caretaker caretaker) {
        caretakers.add(caretaker);
    }

    // Method to remove an animal
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        Random random = new Random();
        int chance = random.nextInt(101); // 0 to 100
        if (chance <= 25) {
            System.out.println(animal.getSpecies() + " " + animal.getName() + " has been adopted. Hooray!");
        } else {
            System.out.println(animal.getSpecies() + " " + animal.getName() + " died in shelter from illness or age...");
        }
    }

    // Method to remove a caretaker
    public void removeCaretaker(Caretaker caretaker) {
        caretakers.remove(caretaker);
    }

    // Method to display all animals
    public void displayAnimals() {
        for (Animal animal : animals) {
            animal.displayInfo();
        }
        System.out.println();
    }

    // Method to display all caretakers
    public void displayCaretakers() {
        for (Caretaker caretaker : caretakers) {
            caretaker.displayInfo();
        }
        System.out.println();
    }
}