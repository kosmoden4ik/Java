package homework_8_5;

import java.util.Objects;

/*
Задание 5
Используя Intelij IDEA создать проект, пакет. Создать класс Animal с именем String, возрастом int, хвостом Boolean.
 В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
 В классе Animal переопределить методы equals & hashCode.
 */
public class Animal {
    String nameAnimal;
    int ageAnimal;
    Boolean tailAnimal;
    Animal(String nameAnimal, int ageAnimal, Boolean tailAnimal){
        this.nameAnimal=nameAnimal;
        this.ageAnimal=ageAnimal;
        this.tailAnimal=tailAnimal;
    }

    @Override
    public String toString() {
        return
                "Имя: '" + nameAnimal + '\'' +
                ", Возраст: " + ageAnimal +
                ", Хвост: " + (tailAnimal?"есть":"нет") +
                '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return ageAnimal == animal.ageAnimal && Objects.equals(nameAnimal, animal.nameAnimal) &&
                Objects.equals(tailAnimal, animal.tailAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimal, ageAnimal, tailAnimal);
    }
}
