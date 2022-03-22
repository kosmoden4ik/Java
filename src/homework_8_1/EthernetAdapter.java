package homework_8_1;

import java.util.Objects;

/*
Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
 Добавить методы доступа. Конструктор.
Задание 3
Смотреть задание 2. В обоих классах переопределить метод toString,
 что бы вывод был следующим: Device: manufacturer =Samsung, price=120,
  serialNumber=AB1234567CD Monitor: manufacturer =Samsung, price=120,
   serialNumber=AB1234567CD, X=1280,Y=1024
   Задание 4

Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе. Создать класс Main,
 в котором создать объекты классов и продемонстрировать переопределенные методы.
 */
public class EthernetAdapter extends Device {
    int speed;
    String mac;
    EthernetAdapter(int speed, String mac, String manufacturer, float price, String serialNumber){
        super(manufacturer, price, serialNumber);
        this.speed=speed;
        this.mac=mac;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: {" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && Objects.equals(mac, that.mac)&&
                (that.price==price) && Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}
