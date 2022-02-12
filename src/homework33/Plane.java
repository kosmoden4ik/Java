package homework33;

public class Plane  extends Vehicle{
    int numberOfPassengers;
    int height;
    Plane (double coordX, double coordY, double priceVehicle, int speedVehicle, int year ,
           int numberOfPassengers, int height ){
       super(coordX, coordY, priceVehicle, speedVehicle, year);
       this.numberOfPassengers=numberOfPassengers;
        this.height=height;
    }
    public void writeInfoVehicle(){
        System.out.println("координаты объекта - "+coordX+"/"+coordY);
        System.out.println("Цена транспортного средства - "+priceVehicle);
        System.out.println("Скорость объекта "+speedVehicle);
        System.out.println("Год выпуска "+year);
        System.out.println("Количество пассажиров "+numberOfPassengers);
        System.out.println("Высота "+height);
        System.out.println("\n");
    }
}
