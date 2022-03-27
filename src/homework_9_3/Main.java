package homework_9_3;
/* Создайте проект, используя IntelliJ IDEA. Создайте класс MyDictionary.
Реализуйте в простейшем приближении возможность использования его экземпляра.
Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления пар элементов,
индексатор для получения значения элемента по указанному
индексу и свойство только для чтения для получения общего количества пар элементов.
         */
public class Main {
    public static void main(String[] args) {
        MyDictionary slovar=new MyDictionary<>();
        slovar.addValue("home", "дом");
        slovar.addValue("shape", "форма");
        slovar.addValue("room", "комната");
        slovar.getValue(1);
        System.out.println("Длина словаря - "+slovar.length());
    }
}
