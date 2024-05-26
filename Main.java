import animals.Animal;

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

        // Displaying specific information about one animal
        System.out.println("\nSpecific Animal Info:");
        System.out.println("Name: " + animal1.getName());
        System.out.println("Age: " + animal1.getAge());
        System.out.println("Species: " + animal1.getSpecies());

        // Setting new values for the first animal
        animal1.setName("Simba");
        animal1.setAge(6);

        // Displaying updated information about the first animal
        System.out.println("\nUpdated Animal Info:");
        animal1.displayInfo();
    }
}