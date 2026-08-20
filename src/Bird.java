public class Bird extends AnimalImp{
    private double wingSpan;
    private boolean canFly;


    public Bird(String name, int age, double weight, boolean isHealthy,double wingSpan, boolean canFly) {
        super(name, age, "Bird", weight, isHealthy);
        setWingSpan(wingSpan);
        setCanFly(canFly);
    }


    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        if (wingSpan > 0) this.wingSpan = wingSpan;
        else System.out.println("Invalid wing span. Please enter a positive value.");
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }



    public void chirp() {
        System.out.printf("%s is chirping melodiously", getName());
    }
    public void fly(){
        if (isCanFly()) System.out.printf("%s is soaring in the sky", getName());
        else System.out.printf("%s cannot fly", getName());
    }
    public void buildNest(){
        System.out.printf("%s is building a nest", getName());
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wing Span: " + wingSpan + " meters");
        System.out.println("Can Fly: " + canFly);
    }

    @Override
    public void move() {
        if (isCanFly()) System.out.printf("%s is flying", getName());
        else System.out.printf("%s is hopping", getName());


    }

    @Override
    public void makeSound() {
        System.out.printf("%s says: Tweet! Tweet!",getName());
    }
}
