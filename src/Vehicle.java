package src;

public abstract class Vehicle {

    public int speed;
    public float weight;

    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public abstract void startEngine();
    public abstract void turnOffEngine();
}
