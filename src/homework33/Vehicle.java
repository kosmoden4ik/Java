package homework33;
/*
Создать класс Vehicle.
В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
выпуска).
Создайте 3 производных класса Plane, Саг и Ship.
Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки.
Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
 */
public class Vehicle {
    double cordX;
    double cordY;
    double priceVehicle;
    int speedVehicle;
    int year;
    Vehicle(){}
    Vehicle(double cordX, double cordY, double priceVehicle, int speedVehicle, int year ){
        this.cordX = cordX;
        this.cordY = cordY;
        this.priceVehicle=priceVehicle;
        this.speedVehicle=speedVehicle;
        this.year=year;
    }
    public void writeInfoVehicle(){
        System.out.println("координаты объекта - "+ cordX +"/"+ cordY);
        System.out.println("Цена транспортного средства - "+priceVehicle);
        System.out.println("Скорость объекта "+speedVehicle);
        System.out.println("Год выпуска "+year);
        System.out.println("\n");
    }
}
