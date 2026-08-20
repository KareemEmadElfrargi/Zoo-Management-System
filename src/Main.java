import java.nio.file.attribute.DosFileAttributes;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    static void main() {
        Zoo zoo = new Zoo("Safari zoo");

        System.out.println("=== Safari Zoo Management System ===\n");
        System.out.println("1. Add Animal");
        System.out.println("2. Display All Animals");
        System.out.println("4. Remove Animal");
        System.out.println("5. Feed All Animals");
        System.out.println("6. Make All Animals Sound");
        System.out.println("7. Move All Animals");
        System.out.println("8. Display Statistics");
        System.out.println("9. Search by Species");
        System.out.println("10. Show Healthy Animals");
        System.out.println("11. Animal Actions Menu");
        System.out.println("0. Exit");

        System.out.println("\nEnter the choice number : ");

        while (true){
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter animal type (Dog/Cat/Bird): ");
                    scanner.nextLine();
                    String type = scanner.nextLine();
                    if (type.equalsIgnoreCase("Dog")) {
                        System.out.println("Enter dog's name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter dog's age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter dog's weight:");
                        double weight = scanner.nextDouble();
                        System.out.println("Is the dog healthy? (true/false):");
                        boolean isHealthy = scanner.nextBoolean();
                        AnimalImp dog = new Dog(name, age, weight, isHealthy);
                        zoo.addAnimal(dog);
                    } else if (type.equalsIgnoreCase("Cat")) {
                        System.out.println("Enter cat's name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter cat's age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter cat's weight:");
                        double weight = scanner.nextDouble();
                        System.out.println("Is the cat healthy? (true/false):");
                        boolean isHealthy = scanner.nextBoolean();
                        System.out.println("Enter the furColor of cat :");
                        String furColor = scanner.nextLine();
                        System.out.println("Is cat inDoor ?");
                        boolean isIndoor = scanner.nextBoolean();
                        AnimalImp cat = new Cat(name, age, weight, isHealthy,furColor, isIndoor);
                        zoo.addAnimal(cat);
                    } else if (type.equalsIgnoreCase("Bird")) {
                        System.out.println("Enter bird's name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter bird's age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter bird's weight:");
                        double weight = scanner.nextDouble();
                        System.out.println("Is the bird healthy? (true/false):");
                        boolean isHealthy = scanner.nextBoolean();
                        System.out.println("Enter the wingspan of bird :");
                        double wingspan = scanner.nextDouble();
                        System.out.println("Can the bird fly? (true/false):");
                        boolean canFly = scanner.nextBoolean();
                        AnimalImp bird = new Bird(name, age, weight, isHealthy, wingspan, canFly);
                        zoo.addAnimal(bird);
                    } else {
                        System.out.println("Invalid animal type.");
                    }
                    break;
                case 2:
                    zoo.displayAllAnimals();
                    break;
                case 4:
                    System.out.println("Enter the name of the animal to remove:");
                    String nameToRemove = scanner.nextLine();
                    zoo.removeAnimal(nameToRemove);
                    break;
                case 5:
                    zoo.feedAllAnimals();
                    break;
                case 6:
                    zoo.makeAllAnimalsSounds();
                    break;
                case 7:
                    zoo.moveAllAnimals();

                    break;
                case 8:
                    zoo.displayStatistics();
                    break;
                case 9:
                    System.out.println("Enter the species to search for:");
                    String species = scanner.nextLine();
                    zoo.searchBySpecies(species);
                    break;
                case 10:
                    zoo.getHealthyAnimals();
                    break;
                case 11:
                    System.out.println("Enter animal name:");
                    String animalName = scanner.nextLine();
                    AnimalImp animal = zoo.findAnimalByName(animalName);
                    if (animal != null) {
                       System.out.println("=== Actions for " + animalName + " ===\n");
                       if (animal instanceof Dog){
                           System.out.println("1. Bark");
                           System.out.println("2. Fetch");
                           System.out.println("3. Wag Tail");

                           System.out.println("Enter choice number : ");
                           int choice = scanner.nextInt();
                           scanner.nextLine();
                           switch (choice) {
                               case 1:
                                   ((Dog) animal).bark();
                                   break;
                               case 2:
                                   ((Dog) animal).fetch();
                                   break;
                               case 3:
                                   ((Dog) animal).wagTail();
                                   break;
                               default:
                                   System.out.println("Invalid choice.");
                           }

                       }else if (animal instanceof Bird){
                           System.out.println("1. chirp");
                           System.out.println("2. fly");
                           System.out.println("3. buildNest");

                           System.out.println("Enter choice number : ");
                           int choice = scanner.nextInt();
                           scanner.nextLine();

                           switch (choice) {
                               case 1:
                                   ((Bird) animal).chirp();
                                   break;
                               case 2:
                                   ((Bird) animal).fly();
                                   break;
                               case 3:
                                   ((Bird) animal).buildNest();
                                   break;
                               default:
                                   System.out.println("Invalid choice.");
                           }
                       }else {
                           System.out.println("1. meow");
                           System.out.println("2. purr");
                           System.out.println("3. scratch");

                           System.out.println("Enter choice number : ");
                           int choice = scanner.nextInt();
                           scanner.nextLine();

                           switch (choice) {
                               case 1:
                                   ((Cat) animal).meow();
                                   break;
                               case 2:
                                   ((Cat) animal).purr();
                                   break;
                               case 3:
                                   ((Cat) animal).scratch();
                                   break;
                               default:
                                   System.out.println("Invalid choice.");
                           }

                       }
                    }else System.out.println("Animal not found.");

                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
