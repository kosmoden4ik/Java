package homework1;

public class Rectangle {
    double side1;
    double side2;
    public Rectangle(){}
    public Rectangle(double side1, double side2){
        this.side1=side1;
        this.side2=side2;
    }
    double areaCalculator (double side1, double side2){
    return side1*side2;
    }
    double areaCalculator(){
        return side1*side2;
    }
    double perimeterCalculator (double side1, double side2){
        return (side1+side2)*2;
    }
    double perimeterCalculator (){
        return (side1+side2)*2;
    }
    void initialSide1(double side1){
        this.side1=side1;
    }
    void initialSide2(double side2){
        this.side2=side2;
    }

    public static void main(String[] args) {
        HelperWrite rec=new HelperWrite();
        Rectangle figur=new Rectangle();
        System.out.println("Для расчета площади прямоугольника введите длину первой стороны: ");
        figur.initialSide1(rec.setandgetValuesDouble());
        System.out.println("введите длину второй стороны: ");
        figur.initialSide2(rec.setandgetValuesDouble());
        System.out.println("Площадь прямоугольника: "+figur.areaCalculator());
        System.out.println("Периметр прямоугольника: "+figur.perimeterCalculator());
    }
}


