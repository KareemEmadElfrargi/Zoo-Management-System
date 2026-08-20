public class AnimalImp  implements Animals{
    private String name;
    private int age;
    private String species;
    private double weight;
    private boolean isHealthy;

    public AnimalImp(String name, int age, String species, double weight, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.weight = weight;
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Invalid animal name.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <=50){
            this.age = age;
        }else {
            System.out.println("Invalid animal age.");
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (!species.isEmpty()){
            this.species = species;
        }else {
            System.out.println("Invalid animal species.");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight>0){
            this.weight = weight;
        }else {
            System.out.println("Invalid animal weight.");
        }
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }



    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
        System.out.println("Weight: " + weight);
        System.out.println("Healthy: " + isHealthy);
    }


}
