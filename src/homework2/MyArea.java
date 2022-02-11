package homework2;
/*
Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
 который должен принимать радиус, и используя PI посчитать площадь круга.
Создать класс Main, где запустить данный метод.
 */
public class MyArea {
    public static final double PI=3.1415;
    static public double areaOfCircle(int radius){
        return PI*Math.pow(radius,2);
    }
}
