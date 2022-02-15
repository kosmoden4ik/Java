package homework52;
/*
Создать класс Main. Создать список целых чисел, заполнить его десятью случайными значениями
 в диапазоне от 10 до 20-ти(включительно). Вывести индекс самого большого и самого маленького числа в списке.
 Используя ListIterator пройтись по списку и увеличить значения на 1, вывести список в консоль.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray=new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<10;i++) {
            numberArray.add((random.nextInt(10)+10));
            System.out.println(numberArray.get(i));
        }
        System.out.println("Индекс самого большого числа - "+numberArray.indexOf(Collections.max(numberArray)));
        System.out.println("Индекс самого маленького числа - "+numberArray.indexOf(Collections.min(numberArray)));
        ListIterator<Integer> iterator = numberArray.listIterator();
        while (iterator.hasNext()) {
            int valueIteration=iterator.next()+1;
            iterator.set(valueIteration);
        }
        ListIterator<Integer> iteratorPrint = numberArray.listIterator();
        while (iteratorPrint.hasNext()) {
            System.out.println(iteratorPrint.next());
        }
    }
}
