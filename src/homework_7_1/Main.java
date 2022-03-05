package homework_7_1;
/*
Создать функциональный интерфейс ErrorPrinter с абстрактным методом printError,
принимающий строку error. Создайте на базе интерфейса ErrorPrinter анонимный класс,
реализующий метод printError. printError принимает строку и выводит ее в консоль красным цветом.
 */
public class Main {
    public static void main(String[] args) {
        ErrorPrinter epson=new ErrorPrinter() {
            @Override
            public void printError(String error) {

                System.out.println("\u001B[31m"+error+"  error printer");
            }
        };
        epson.printError("Sony");
    }
}
