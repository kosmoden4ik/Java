package homework2;
/*
(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы вызывая конструктор из конструктора.
Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.
 */
public class Car {
    private static final int DEFAULT_YEAR=2021;
    private static final double DEFAULT_SPEED=200.0;
    private static final double DEFAULT_WEIGHT=2000.0;
    private static final String DEFAULT_COLOR="White";
    int year;
    double speed;
    double weight;
    String color;
    Car(){}
    Car(int year, double speed, double weight, String color){
        this.year=year;
        this.speed=speed;
        this.weight=weight;
        this.color=color;
    }
    Car (int year){
        this(year, DEFAULT_SPEED, DEFAULT_WEIGHT, DEFAULT_COLOR);
    }
    Car (int year, double speed){
        this(year, speed, DEFAULT_WEIGHT, DEFAULT_COLOR);
    }
    Car (int year, double speed, double weight){
        this(year, speed, weight, DEFAULT_COLOR);
    }
}
