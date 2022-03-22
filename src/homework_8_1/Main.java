package homework_8_1;
/*
Device: manufacturer =Samsung, price=120,
  serialNumber=AB1234567CD Monitor: manufacturer =Samsung, price=120,
   serialNumber=AB1234567CD, X=1280,Y=1024
   Задание 4

Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе. Создать класс Main,
 в котором создать объекты классов и продемонстрировать переопределенные методы.
 */

public class Main {
    public static void main(String[] args) {
        Device calculater=new Device("Samsung", 120, "AB1234567CD");
        Monitor diagonal=new Monitor(1280,  1024,"Samsung", 1280, "AB1234567CD");
        EthernetAdapter svich=new EthernetAdapter(1000,"42187987412987","CISCO", 500, "AB1234567CD");
        EthernetAdapter modem=new EthernetAdapter(1000,"42187987412987","CISCO", 500, "AB1234567CD");
        System.out.println(calculater.toString());
        System.out.println(diagonal.toString());
        System.out.println(svich.toString());
        System.out.println();
        System.out.println("calculater equals diagonal  -  "+calculater.equals(diagonal));
        System.out.println("diagonal equals diagonal  -  "+diagonal.equals(diagonal));
        System.out.println("svich equals modem  -  "+svich.equals(modem));
        System.out.println();
        System.out.println("calculater hash  -  "+calculater.hashCode());
        System.out.println("diagonal hash  -  "+diagonal.hashCode());
        System.out.println("svich hash  -  "+svich.hashCode());
    }
}
