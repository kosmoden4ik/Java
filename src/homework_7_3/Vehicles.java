package homework_7_3;
/*
Создайте перечислительный тип (enum) Vehicles, содержащий конструктор,
 который должен принимать целочисленное значение (стоимость автомобиля).
  Энум должен содержать метод getColor(), который возвращает строку с цветом автомобиля,
   и  перегруженный метод toString(),
 который должен возвращать строку с названием экземпляра, цветом и стоимостью автомобиля.
 */
public enum Vehicles {
    FABIA(6500){public String toString(){return "nameAvto - Fabia, Цена авто - "+priceAvto+", Цвет авто - "+colorAvto;}},
    OKTAVIA(8500){public String toString(){return "nameAvto - OKTAVIA, Цена авто - "+priceAvto+", Цвет авто - "+colorAvto;}},
    SUPERB(10500){public String toString(){return "nameAvto - SUPERB, Цена авто - "+priceAvto+", Цвет авто - "+colorAvto;}};

    double priceAvto;
    String colorAvto;
    Vehicles(double priceAvto){
        this.priceAvto=priceAvto;
    }
    String getColor(){
        return colorAvto;
    }
    void setColor(String colorAvto){
        this.colorAvto=colorAvto;
    }
}
