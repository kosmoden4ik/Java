package homework_9_2;
/*
Создайте проект, используя IntelliJ IDEA. Создайте класс MyDictionary.
Реализуйте в простейшем приближении возможность использования его экземпляра.
Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов,
индексатор для получения значения элемента по указанному индексу и
 свойство только для чтения для получения общего количества пар элементов.
 */
public class Main {
    public static void main(String[] args) {
        MyList <Integer> malmo=new MyList();
        malmo.addValue(12);
        malmo.addValue(22);
        malmo.addValue(33);
        malmo.addValue(44);
        malmo.addValue(55);
        malmo.addValue(66);
        malmo.addValue(77);
        malmo.addValue(88);
        malmo.addValue(99);
        malmo.addValue(0);
        malmo.addValue(1);
        malmo.addValue(2);
        malmo.addValue(3);
        malmo.addValue(4);
        System.out.println(malmo.getValue(0));
        System.out.println(malmo.getValue(10));
        System.out.println("Длина списка - "+malmo.length());

        MyList <String> arrayVar=new MyList();
        arrayVar.addValue("OlonDjonson");
        System.out.println(arrayVar.getValue(0));
    }
}
