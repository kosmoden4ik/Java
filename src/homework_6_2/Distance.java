package homework_6_2;
/*
Создать класс Distance с полем distance типа double и методом print. В классе Distance,
создайте вложенный класс Converter со статическими методами, которые будут конвертировать
расстояние в разные единицы измерения
(к примеру, из метров в километры, из километров в мили, и так далее).
 */
public class Distance{
    double distance; //metr
    Distance(){
        this.distance=0;
    }
    Distance(double distance){
        this.distance=distance;
    }
    double print(){
        return distance;
    }
    public class Converter{

        Converter(){
            Distance convertation=new Distance();
            convertation.distance=0;
        }
        Converter(double distance){
            Distance convertation=new Distance();
            convertation.distance=distance;
        }

        static double toSantimetr(double convertDistance){
            return convertDistance*100;
        }
        static double toMilimetr(double distance){
            return distance*1000;
        }
        static double toKilometr(double distance){
            return distance/1000;
        }
        //
        static double toMili(double distance){
            return distance*0.000621371;
        }
    }
}
