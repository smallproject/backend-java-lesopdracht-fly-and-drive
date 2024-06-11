package src;

public class FlyingCar extends Vehicle implements Driveable,Flyable {

    private String name;
    private String model;

    public FlyingCar(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void accelerate() {
        System.out.println("FlyingCar is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Flyingcar is braking..");
    }

    @Override
    public void changeGear() {
        System.out.println("Flyingcar changing gear...");

    }

    @Override
    public void takeOff() {
        System.out.println("Flyingcar taking off..");

    }

    @Override
    public void land() {
        System.out.println("Flyingcar is landing..");

    }

    @Override
    public void changeHeight() {

    }

    @Override
    public void startEngine() {
        System.out.println("Flyingcar engine start..");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Flyingcar engine turning off..");
    }
}
