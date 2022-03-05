package homework_7_2;
/*
Создайте перечислительный тип (enum) Animals, содержащий конструктор,
 который должен принимать целочисленное значение
 (возраст животного). Энум должен содержать перегруженный метод toString(),
 который должен возвращать название экземпляра и возраст животного.
 */
enum Animals {

    FISH(1){public String toString(){
    return "Name - Nemo, age - "+ageAnimal;
    }},
    CAT(4){public String toString(){
        return "Name - Kisa, age - "+ageAnimal;
    }},
    DOG(7){public String toString(){
        return "Name - Mylo, age - "+ageAnimal;
    }},
    BATMAN(36){ public String toString(){
        return "Name - Bruce, age - "+ageAnimal;
    }};


int ageAnimal;
Animals(int ageAnimal){
    this.ageAnimal=ageAnimal;
}
}

