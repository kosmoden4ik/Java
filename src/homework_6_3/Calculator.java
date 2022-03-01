package homework_6_3;
/*
Дополнительное задание
Создать класс Calculator, с методами для выполнения основных арифметических операций.
Написать программу, которая выводит на экран основные арифметические операции.
 */
public class Calculator {
    double firstValue;
    double secondValue;
    Calculator(){};
    Calculator(double firstValue, double secondValue){
        this.firstValue=firstValue;
        this.secondValue=secondValue;
    }
    class Summ{
        double Summa;
        Summ() {
            Summa = firstValue + secondValue;
        }
        public void Print(){
          System.out.println("Результат сложения "+ Summa);
        }
    }
    class Minus{
        double Minus;
        Minus() {
            Minus = firstValue - secondValue;
        }
        public void Print(){
            System.out.println("Результат вычитания "+ Minus);
        }
    }
    class Delenie{
        double Delenie;
        Delenie() {
            if(secondValue!=0) {
                Delenie = firstValue / secondValue;
            }
            else{
                System.out.println("ERROR-деление на ноль");
            }
        }
        public void Print(){
            if(secondValue!=0) {
                System.out.println("Результат деления " + Delenie);
            }
        }
    }
    class Proizvedenie{
        double Proiz;
        Proizvedenie() {
            Proiz = firstValue * secondValue;
        }
        public void Print(){
            System.out.println("Результат умножения "+ Proiz);
        }
    }
}
