package homework_6_1;
/*
Создать класс Vehicle. В классе Vehicle, создайте внутренние, приватные классы Wheel и Door,
 которые содержат поле color(содержит цвет).
Создайте методы printWheelColor, printDoorColor y класса Vehicle - выведите цвета в консоль в классе Main.
 */
public class Vehicle {
    Wheel pocket;
    Door onStreet;
  Vehicle(){};
    Vehicle(String colorWheel, String colorDoor){
        this.pocket=new Wheel(colorWheel);
        this.onStreet=new Door(colorDoor);
    }
public class Wheel{
    String color;
    Wheel(){};
    Wheel(String color){
        this.color=color;
    }
    public String printColor(){
        return color;
    }
}
private class Door{
    String color;
    Door(){}
    Door(String color){
        this.color=color;
    }
    public String printColor(){
        return color;
    }
}
public void setWheelColor(String color){
        this.pocket=new Wheel(color);
}
public void setDoorColor(String color){
        this.onStreet=new Door(color);
}
public String printWheelColor(Wheel onWheel){
    return onWheel.printColor();
}
public String printDoorColor(Door myDoor){
return myDoor.printColor();
}
}


