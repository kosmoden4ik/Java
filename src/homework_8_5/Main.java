package homework_8_5;
/*
Задание 5
Используя Intelij IDEA создать проект, пакет. Создать класс Animal с именем String, возрастом int, хвостом Boolean.
 В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
 В классе Animal переопределить методы equals & hashCode.
 */
public class Main {
    public static void main(String[] args) {
        Animal uasya=new Animal("Васька", 45, false);
        Animal kisa=new Animal("Киса", 11, true);
        Animal Vasiliy=new Animal("Васька", 45, false);
        System.out.println();
        System.out.println(uasya.toString());
        System.out.println(kisa.toString());
        System.out.println(Vasiliy.toString());
        System.out.println();
        System.out.println("uasya equals kisa - "+ uasya.equals(kisa));
        System.out.println("uasya equals Vasiliy - "+ uasya.equals(Vasiliy));
        System.out.println();
        System.out.println("uasya hash - "+ uasya.hashCode());
        System.out.println("kisa hash - "+ kisa.hashCode());
        System.out.println("Vasiliy hash - "+ Vasiliy.hashCode());
    }
}
