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
        ////////////////////////////////////////////////////////////////////////////
        Computer[] Computers=new Computer[5];
        for (Computer tempC:Computers){
            tempC=new Computer();
        }
        //////////////////////////////////////////////////////////////////////////////
        Address myAddress=new Address();
        myAddress.setCountry("Ukraine");
        myAddress.setCity("Dnipro");
        myAddress.setStreet("Volodimira Monomaha");
        myAddress.setHouse(25);
        myAddress.setApartment(67);
        myAddress.setIndex(49000);
        System.out.println("Страна - "+myAddress.getCountry()+
                "\n Город "+myAddress.getCity()+
                "\n Улица "+myAddress.getStreet()+
                "\n Дом "+myAddress.getHouse()+
                "\n Квартира "+myAddress.getApartment()+
                "\n Почтовый индекс "+myAddress.getIndex()
        );
    }
}
