package homework_9_4;
/*
Создайте проект, используя IntelliJ IDEA. Создайте класс MyClass,
содержащий статический фабричный метод - T factoryMethod(),
который будет порождать экземпляры типа,
указанного в качестве параметра типа (указателя места заполнения типом – Т).
 */
public class MyClass {

   public <T> T factoryMethod(T valueObj){
     T facObj=(T)new Object();
       facObj=valueObj;
        return facObj;
    }
}
