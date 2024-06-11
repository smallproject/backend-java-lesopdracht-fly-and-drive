package src;

public class Main {
    public static void main(String[] args) {

        System.out.println("Car");
        Car vw = new Car("volkswagon", "jetta", 240, 1300);
        vw.startEngine();
        vw.accelerate();

        System.out.println("\n\nPLane");
        Plane boeing = new Plane("Boeing", "787-9", 950, 183500);
        boeing.startEngine();
        boeing.takeOff();

        System.out.println("\n\nFlying Car");
        FlyingCar aeromobil = new FlyingCar("Aeromobil", "AM 4.0", 450, 1900);
        aeromobil.startEngine();
        aeromobil.accelerate();
        aeromobil.takeOff();


        System.out.println("\n\nFlying Car");


    }
}
