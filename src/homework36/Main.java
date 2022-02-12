package homework36;
/*Создайте класс Printer.
В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове
соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
выводились разными цветами.
 */
public class Main {

    public static void main(String[] args) {
        Printer epson=new Printer();
        epson.print("Epson Printer");
        Printer canon=new Kseroks();
        canon.print("Canon Printer - Как-то так");
    }

}
