package homework_9_4;

import homework_8_1.Device;
/*
Создайте проект, используя IntelliJ IDEA. Создайте класс MyClass,
содержащий статический фабричный метод - T factoryMethod(),
который будет порождать экземпляры типа,
указанного в качестве параметра типа (указателя места заполнения типом – Т).
 */
public class Main {
    public static void main(String[] args) {
        MyClass myFabric=new MyClass();
        System.out.println(  myFabric.factoryMethod("Stringa"));
        System.out.println(  myFabric.factoryMethod(12));

    }

}
