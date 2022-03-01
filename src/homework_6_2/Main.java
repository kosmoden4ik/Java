package homework_6_2;

import java.util.Scanner;
/*
Создать класс Distance с полем distance типа double и методом print. В классе Distance,
создайте вложенный класс Converter со статическими методами, которые будут конвертировать
расстояние в разные единицы измерения
(к примеру, из метров в километры, из километров в мили, и так далее).
 */
public class Main {
    public static void main(String[] args) {
        Distance convertValue=new Distance();
        System.out.println("Введите число для перевода: ");
        Scanner in = new Scanner(System.in);
        Double valueDouble = in.nextDouble();
        convertValue.new Converter();
        System.out.println("Расстояние в км: "+Distance.Converter.toKilometr(valueDouble));
        System.out.println("Расстояние в мм: "+Distance.Converter.toMilimetr(valueDouble));
        System.out.println("Расстояние в см: "+Distance.Converter.toSantimetr(valueDouble));
        System.out.println("Расстояние в мили: "+Distance.Converter.toMili(valueDouble));
    }
}
