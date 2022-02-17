package homework_6_1;
/*
Создать класс Vehicle. В классе Vehicle, создайте внутренние, приватные классы Wheel и Door,
        которые содержат поле color(содержит цвет).
        Создайте методы printWheelColor, printDoorColor y класса Vehicle - выведите цвета в консоль в классе Main.
        */
public class Main {
    public static void main(String[] args) {
        ////Через метод
        Vehicle house=new Vehicle();
         house.setWheelColor("Red");
         house.setDoorColor("White");
        System.out.println(house.printWheelColor(house.pocket));
        System.out.println(house.printDoorColor(house.onStreet)+"\n\n");

        ///////Через конструктор
        Vehicle houses=new Vehicle("blue", "black");
        System.out.println(houses.printWheelColor(houses.pocket));
        System.out.println(houses.printDoorColor(houses.onStreet));
    }
}
