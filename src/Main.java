package src;

public class Main {
    public static void main(String[] args) {

        System.out.println("Car");
        Car vw = new Car("volkswagon", "jetta");
        vw.startEngine();
        vw.accelerate();

        System.out.println("\n\nPLane");
        Plane boeing = new Plane("Boeing", "787-9");
        boeing.startEngine();
        boeing.takeOff();

        System.out.println("\n\nFlying Car");
        FlyingCar aeromobil = new FlyingCar("Aeromobil", "AM 4.0");
        aeromobil.startEngine();
        aeromobil.accelerate();
        aeromobil.takeOff();
    }
}
