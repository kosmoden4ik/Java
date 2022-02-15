package homework51;

import java.util.ArrayList;

/*
Используя Intelij IDEA создать проект, пакет. Создать класс Zoo. В классе создать список,
 в который записать 8 животных через метод add(index, element).
 Вывести список в консоль.
 */
public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zooList=new ArrayList<>();
        zooList.add(0, "ластоногая коза");
        zooList.add(1, "саблезубый кузнечик");
        zooList.add(2, "Подкустовный выползень");
        zooList.add(3, "Бородатик");
        zooList.add(4, "Скунсовидная корова");
        zooList.add(5, "хорёк-паникёр");
        zooList.add(6, "карликовый бангладешский овцеконь");
        zooList.add(7, "среднеевропейский древесный хохотун");
        System.out.println(zooList);

        /*
        Используя Intelij IDEA создать проект, пакет. Используя класс Zoo Задания 2, удалить 3, 5, 7 животные,
         узнать размер списка и вывести в консоль.
         */
        //3 , 5 , 7 животные т.е. по индексу листа это будет 2,4,6. Я так думаю. И буду удалять в обратном порядке т.к.
        // Индексы меняются(удаляются и размер уменьшается)
        zooList.remove(6);
        zooList.remove(4);
        zooList.remove(2);

        System.out.println("Разммер списка - "+zooList.size());
    }
}
