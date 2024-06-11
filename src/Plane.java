package src;

import java.util.function.DoubleToIntFunction;

public class Plane extends Vehicle implements Flyable{

    private String name;
    private String model;

    public Plane(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off...");
    }

    @Override
    public void land() {
        System.out.println("vehicle is landing..");
    }

    @Override
    public void changeHeight() {
        System.out.println("Changing altitude...");
    }

    @Override
    public void startEngine() {
        System.out.println("starting engine...");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("Enging turning off..");
    }
}
