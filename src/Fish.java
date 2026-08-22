public class Fish extends AnimalImp{
    int tankSize;
    boolean isSaltWater;

    public Fish(String name, int age, String species, double weight, boolean isHealthy) {
        super(name, age, species, weight, isHealthy);
    }


    public void swim(){
        System.out.printf("%s is swimming in the tank.", this.getName());
    }
    public void blowBubbles(){
        System.out.printf("%s  is blowing bubbles.", this.getName());
    }
}
