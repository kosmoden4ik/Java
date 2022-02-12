package homework33;

public class Main {
    public static void main(String[] args) {
        Car ferrary=new Car(36.6, 58.4, 25000, 160, 2021);
        Plane airbus=new Plane(60.3,43.4,500000,400,2012,
                120, 2000);
        Ship brutalnik=new Ship(10,22.4,1000000,200,2005,500,
                "Barselona");
        ferrary.writeInfoVehicle();
        airbus.writeInfoVehicle();
        brutalnik.writeInfoVehicle();
    }
}
