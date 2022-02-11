package homework2;
/*
(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы.
Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

 */
public class avtomachine {
    int year;
    double speed;
    int weight;
    String color;
    avtomachine(){}
    avtomachine(int year){
        this.year=year;
    }
    avtomachine(double speed){
        this.speed=speed;
    }
    avtomachine(String color){
        this.color=color;
    }
    avtomachine(int year, double speed){
        this.year=year;
        this.speed=speed;
    }
    avtomachine(int year, double speed, int weight){
        this.year=year;
        this.speed=speed;
        this.weight=weight;
    }
    avtomachine(int year, double speed, int weight, String color){
        this.year=year;
        this.speed=speed;
        this.weight=weight;
        this.color=color;
    }
}
