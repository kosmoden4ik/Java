package homework_10_1;
import java.util.ArrayList;
import java.util.Iterator;
/*
Задание 2
Вывод на экран элементов List: Создать список, заполнить его
 на 10 элементов и вывести на экран содержимое используя iterator.
 */
public class myIterator {
    public static void main(String[] args) {
        ArrayList <Integer> myArrayList=new ArrayList();
        myArrayList.add(13);
        myArrayList.add(26);
        myArrayList.add(32);
        myArrayList.add(48);
        myArrayList.add(11);
        myArrayList.add(27);
        myArrayList.add(10);
        myArrayList.add(0);
        myArrayList.add(7);
        myArrayList.add(38);

        Iterator <Integer> wowIterator=myArrayList.iterator();
        while (wowIterator.hasNext()){
            System.out.println(wowIterator.next());
        }
    }
}
