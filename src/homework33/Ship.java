package homework33;

public class Ship  extends Vehicle{
    int numberOfPassengers;
    String homePort;
Ship(double coordX, double coordY, double priceVehicle, int speedVehicle, int year, int numberOfPassengers, String homePort){
    super(coordX, coordY, priceVehicle, speedVehicle, year);
    this.numberOfPassengers=numberOfPassengers;
    this.homePort=homePort;
}
    public void writeInfoVehicle(){
        System.out.println("координаты объекта - "+coordX+"/"+coordY);
        System.out.println("Цена транспортного средства - "+priceVehicle);
        System.out.println("Скорость объекта "+speedVehicle);
        System.out.println("Год выпуска "+year);
        System.out.println("Количество пассажиров "+numberOfPassengers);
        System.out.println("Порт приписки"+homePort);
        System.out.println("\n");
    }
}
