package src;

public class Car extends Vehicle implements Driveable{

    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void accelerate() {
        System.out.println("Accelarating..");
    }

    @Override
    public void brake() {
        System.out.println("Braking..");
    }

    @Override
    public void changeGear() {
        System.out.println("Changing gear..");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starts");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Engine turning off");
    }
}
