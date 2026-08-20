public class Dog extends AnimalImp{
    private String breed;

    public Dog(int age, String species, double weight, boolean isHealthy) {
        super("Dog", age, species, weight, isHealthy);
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty()){
            this.breed = breed;
        }else {
            System.out.println("Invalid breed. Please enter a valid breed.");
        }
    }

    @Override
    public void makeSound() {
        System.out.printf("%s says : Woof! Woof!",getName());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }

    @Override
    public void move() {
        System.out.printf("%s is running", getName());
    }

    public void bark(){
        System.out.printf("%s is barking loudly!", getName());
    }
    public void fetch() {
        System.out.printf("%s is fetching the ball", getName());
    }
    public void wagTail() {
        System.out.printf("%s is wagging tail happily!", getName());
    }
}
