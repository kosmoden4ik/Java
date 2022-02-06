package homework1;

public class StartMain {
    public static void main(String[] args) {
        HelperWrite rec=new HelperWrite();
        Rectangle figur=new Rectangle();
        System.out.println("Для расчета площади прямоугольника введите длину первой стороны: ");
        figur.initialSide1(rec.setandgetValuesDouble());
        System.out.println("введите длину второй стороны: ");
        figur.initialSide2(rec.setandgetValuesDouble());
        System.out.println("Площадь прямоугольника: "+figur.areaCalculator());
        System.out.println("Периметр прямоугольника: "+figur.perimeterCalculator());
        //////////////////////////////////////////////////////////////////////////
        Book newBook=new Book();
        newBook.AddAuthor();
        newBook.AddTitle();
        newBook.AddContentBook();
        newBook.show();
    }
}
