public class Cat extends AnimalImp{
    private String furColor;
    private boolean isIndoor;


    public Cat(int age, String species, double weight, boolean isHealthy,String furColor, boolean isIndoor) {
        super("Cat", age, species, weight, isHealthy);
        setFurColor(furColor);
        setIndoor(isIndoor);
    }


    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        if (!furColor.isEmpty()){
            this.furColor = furColor;
        }else {
            System.out.println("Invalid fur color. Please enter a valid fur color.");
        }
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        this.isIndoor = indoor;
    }

    public void meow(){
        System.out.printf("%s is meowing softly", getName());
    }
    public void purr(){
        System.out.printf("%s is purring contentedly", getName());
    }
    public void scratch(){
        System.out.printf("%s is scratching the post", getName());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur Color: " + furColor);
        System.out.println("Indoor: " + isIndoor);
    }

    @Override
    public void move() {
        System.out.printf("%s is sneaking quietly.", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s says: Meow!", getName());
    }


}
