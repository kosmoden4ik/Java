package homework2;
/*
Создать класс Машина с полями год(int), цвет(String).
Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */
public class machine {
    int year;
    String color;
    public machine(){}
    public machine(int year){
        this.year=year;
    }
    public  machine(String color){
        this.color=color;
    }
    public machine(int year, String color){
        this.year=year;
        this.color=color;
    }
}
