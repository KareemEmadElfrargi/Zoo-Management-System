import java.util.ArrayList;

public class Zoo {
    ArrayList<AnimalImp> animals;
    String zooName;

    public Zoo(String zooName) {
        this.animals = new ArrayList<>();
        setZooName(zooName);
    }

    public ArrayList<AnimalImp> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<AnimalImp> animals) {
        this.animals = animals;
    }

    public String getZooName() {
        return zooName;
    }
    public void setZooName(String zooName) {
        if (zooName != null && !zooName.trim().isEmpty()) this.zooName = zooName;

    }


    public void addAnimal(AnimalImp animal){
        animals.add(animal);
        System.out.printf("%s has been added to %s%n",animal.getName(),zooName);
    }

    public void displayAllAnimals(){
        if (!animals.isEmpty()){
            for (AnimalImp animal : animals) {
                animal.displayInfo();
                System.out.println("- - - - - - -");
            }
        }else System.out.printf("No animals in %s.%n", zooName);
    }

    public AnimalImp findAnimalByName(String name){
        for (AnimalImp animal : animals){
            if (animal.getName().equalsIgnoreCase(name)){
                return animal;
            }
        }
        return null;
    }
    public void removeAnimal(String name){
        AnimalImp animal = findAnimalByName(name);
        if (animal != null) {
            animals.remove(animal);
            System.out.printf("%s has been removed from %s.%n", animal.getName(), zooName);
        } else System.out.printf("Animal with name %s not found in %s.%n", name, zooName);
    }
    public void healAnimal(String name){
        AnimalImp animal = findAnimalByName(name);
        animal.setHealthy(true);
        System.out.println("Animal with name " + name + " has been healed.");
    }

    public ArrayList<AnimalImp> getUnhealthyAnimals(){
        ArrayList<AnimalImp> unhealthyAnimals = new ArrayList<>();
        for (AnimalImp animal : animals){
            if (animal.isHealthy()) {
                unhealthyAnimals.add(animal);
            }
        }
        return unhealthyAnimals;
    }

    public void feedAllAnimals(){
        for (AnimalImp animal : animals) {
            animal.eat();
        }
    }
    public void makeAllAnimalsSounds(){
        for (AnimalImp animal : animals) {
            animal.makeSound();
        }
    }

    public void moveAllAnimals(){
        for (AnimalImp animal : animals) {
            animal.move();
        }
    }
    public int getTotalAnimals(){
        return animals.size();
    }
    public void displayStatistics(){
        int dogCount = 0;
        int catCount = 0;
        int birdCount = 0;
        int healthyCount = 0;
        System.out.printf("----- %s ------",getZooName());
        System.out.printf("Total Animals: %d%n", getTotalAnimals());
        System.out.printf("Average Age : %.2f%n", getAverageAge());
        for (AnimalImp animal : animals) {
            if (animal instanceof Dog) dogCount ++;
            else if (animal instanceof Cat) catCount ++;
            else if (animal instanceof Bird) birdCount ++;
        }
        System.out.printf("Dogs: %d, Cats: %d, Birds: %d%n", dogCount, catCount, birdCount);

        for (AnimalImp animal : animals){
            if (animal.isHealthy()){
                healthyCount++;
            }
        }
        System.out.printf("Healthy Animals: %d%n", healthyCount);

        AnimalImp oldestAnimal = animals.getFirst();

        for (AnimalImp animal : animals){
            if (animal.getAge() > oldestAnimal.getAge()){
                oldestAnimal = animal;
            }
        }
        System.out.printf("Oldest Animal: %s%n", oldestAnimal.getName());

    }
    public void getHeaviestAnimal(){
        AnimalImp heaviestAnimal = animals.getFirst();
        for (AnimalImp animal : animals){
            if (animal.getWeight() > heaviestAnimal.getWeight()){
                heaviestAnimal = animal;
            }

        }
    }
    public double getTotalWeight(){
        double totalWeight = 0;
        for (AnimalImp animal : animals){
            totalWeight += animal.getWeight();
        }
    }
    public void searchBySpecies(String species){
        for (AnimalImp animal : animals) {
            if (animal.getSpecies().equals(species)) {
                animal.displayInfo();
                System.out.println("- - - - - - -");
            }else System.out.printf("No %s found in %s.%n", species, zooName);
        }
    }
    public ArrayList<AnimalImp> getHealthyAnimals(){
        ArrayList<AnimalImp> healthyAnimals = new ArrayList<>();
        for (AnimalImp animal : animals) {
            if (animal.isHealthy()) {
                healthyAnimals.add(animal);
            }
        }
        return healthyAnimals;
    }
    public ArrayList<AnimalImp> getAnimalsByAgeRange(int minAge, int maxAge){
        ArrayList<AnimalImp> animalsInAgeRange = new ArrayList<>();
        for (AnimalImp animal : animals) {
            if (animal.getAge() >= minAge && animal.getAge() <= maxAge) {
                animalsInAgeRange.add(animal);
            }
        }
        return animalsInAgeRange;
    }

    private double getAverageAge() {
        if (animals.isEmpty()) return 0;
        double totalAge = 0;
        for (AnimalImp animal : animals) {
            totalAge += animal.getAge();
        }
        return totalAge / animals.size();
    }

}
