package homework3;
/*
Создать класс, представляющий учебный класс ClassRoom.
Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
отдыхать.
 */
public class ClassRoom {
    public static void main(String[] args) {
        Pupil onePupil=new ExcelentPupil();
        Pupil twoPupil=new GoodPupil();
        Pupil threePupil=new BadPupil();
        Pupil forPupil=new Pupil(4,3,2,5);
        System.out.println("Первый ученик :\n"+onePupil.writeResult());
        System.out.println("Второй ученик :\n"+twoPupil.writeResult());
        System.out.println("Третий ученик :\n"+threePupil.writeResult());
        System.out.println("Четвертый ученик :\n"+forPupil.writeResult());
    }

}
