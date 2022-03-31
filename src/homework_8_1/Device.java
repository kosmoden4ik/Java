package homework_8_1;

import java.util.Objects;

/*
Задание 2
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
public class Device {
    String manufacturer;
    float price;
    String serialNumber;
    public Device(String manufacturer, float price, String serialNumber){
        this.manufacturer=manufacturer;
        this.price=price;
        this.serialNumber=serialNumber;
    }

    public Device() {

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Device: {" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return (device.price==price) && Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
