package homework_10_2;
/*
В папке с примерами, ex_004_comparable. Дописать логику, чтобы метод compareTo()
осуществил поиск по скорости(если же скорость у 2-х объектов равна,
 то ищем по цене) -> цене - > моделе -> цвету машины.
 */
public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            temp = this.price - ((Car) o).price;
             if (temp == 0) {
                temp=this.model.compareTo(((Car) o).model);
                if(temp==0){
                    return this.color.compareTo(((Car) o).color);
                }
                else {
                    return temp;
                }
            }
             else {
                 return temp;
             }
        }
        else {
            return temp;
        }

    }


}
