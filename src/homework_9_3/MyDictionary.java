package homework_9_3;

/*
Создайте проект, используя IntelliJ IDEA. Создайте класс MyDictionary.
Реализуйте в простейшем приближении возможность использования его экземпляра.
Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов,
индексатор для получения значения элемента по указанному индексу и
 свойство только для чтения для получения общего количества пар элементов.
 */
public class MyDictionary <T> {
    T firstList[]=(T[])new Object[10];
    T secondList[]=(T[])new Object[10];
    int indexSize=0;
    MyDictionary(){

    }
    void addValue(T valueFirstList, T valueSecondList){
        if(indexSize==this.firstList.length-1){
            resizeList();
        }
        this.firstList[indexSize]=valueFirstList;
        this.secondList[indexSize]=valueSecondList;
        indexSize++;
    }
    private void resizeList(){
        T newList[]=(T[])new Object[firstList.length+10];
        T newSecondList[]=(T[])new Object[firstList.length+10];
        for(int i = 0; i< firstList.length; i++){
            newList[i]= (T) firstList[i];
            newSecondList[i]=(T) secondList[i];
        }

        firstList =newList;
        secondList=newSecondList;
    }
    public void getValue(int index){
        if(index< firstList.length) {

            System.out.println(firstList[index]+"   -   "+secondList[index]);
        }
        else{
            throw new RuntimeException("Выход за диапазон");
        }
    }

    int length(){
        return indexSize;
    }
}
