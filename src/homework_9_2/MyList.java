package homework_9_2;
/*
 Создайте проект, используя IntelliJ IDEA. Создайте класс MyList.
 Реализуйте в простейшем приближении возможность использования
 его экземпляра аналогично экземпляру класса List.
 Минимально требуемый интерфейс взаимодействия с экземпляром,
 должен включать метод добавления элемента,
 индексатор для получения значения элемента по указанному индексу
 и свойство только для чтения для получения общего количества элементов.
 */
public class MyList<T> {
    T valueList[]=(T[])new Object[10];
    int indexSize=0;
   MyList(){

    }
    void addValue(T valueList){
        if(indexSize==this.valueList.length-1){
            resizeList();
        }
       this.valueList[indexSize]=valueList;
       indexSize++;
    }
    private void resizeList(){
       T newList[]=(T[])new Object[valueList.length+10];
       for(int i = 0; i< valueList.length; i++){
           newList[i]= (T) valueList[i];
       }

        valueList =newList;
    }
    public T getValue(int index){
       if(index< valueList.length) {
return valueList[index];
       }
       else{
           throw new RuntimeException("Выход за диапазон");
       }
    }

    int length(){
       return indexSize;
    }
}
