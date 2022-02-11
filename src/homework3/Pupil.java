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
public class Pupil {
int studyHour;
int readHour;
int writeHour;
int relaxHour;
Pupil(){}
    Pupil(int studyHour,int readHour, int writeHour, int relaxHour){
    this.studyHour=studyHour;
    this.readHour=readHour;
    this.writeHour=writeHour;
    this.relaxHour=relaxHour;
    }
void  study(int studyHour){
this.studyHour=studyHour;
}
void read(int readHour){
this.relaxHour=readHour;
}
void write(int writeHour){
this.writeHour=writeHour;
}
void relax(int relaxHour){
this.relaxHour=relaxHour;
}
String writeResult(){
    String writeR="Время потраченное на обучение - "+studyHour+
            "\nВремя потраченное на чтение - "+readHour+
            "\nВремя потраченое на письмо - "+writeHour+
            "\nВремя потраченное на отдых - "+relaxHour;
    return  writeR;
}
}
