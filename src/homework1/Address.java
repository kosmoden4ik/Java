package homework1;
/*
Доп. Задание
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.
 */
public class Address {
int index;
String country;
String city;
String street;
int house;
int apartment;
Address(){}
int getIndex(){
    return index;
}
void setIndex(int index){
    this.index=index;
}
String getCountry(){
    return country;
}
void setCountry(String country){
    this.country=country;
}
    String getCity(){
        return city;
    }
    void setCity(String city){
        this.city=city;
    }
    String getStreet(){
        return street;
    }
    void setStreet(String street){
        this.street=street;
    }
    void setHouse(int house){
        this.house=house;
    }
    int getHouse(){
        return house;
    }
    void setApartment(int apartment){
        this.apartment=apartment;
    }
    int getApartment(){
        return apartment;
    }
}
