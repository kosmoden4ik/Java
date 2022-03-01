package homework_6_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        Double valueFirstDouble = in.nextDouble();
        System.out.println("Введите второе число: ");

        Double valueSecondDouble = in.nextDouble();
        Calculator kak_to_tak = new Calculator(valueFirstDouble, valueSecondDouble);
        kak_to_tak.new Minus().Print();
        kak_to_tak.new Delenie().Print();
        kak_to_tak.new Proizvedenie().Print();
        kak_to_tak.new Summ().Print();
    }
}
