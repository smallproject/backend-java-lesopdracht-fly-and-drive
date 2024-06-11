package src;

public class Airport {
    private String vehicleName;

    public Airport(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void permitTakeOff(String name) {
        switch (name) {
            case "Singapore Airlines":
            case "Qatar Airlines":
            case "Boeing":
            case "Aeromobil":
                System.out.println("Allowed to take off");
                break;

            default:
                System.out.println("taking off is not permitted!");
        }
    }
}
