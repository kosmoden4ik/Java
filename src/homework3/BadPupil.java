package homework3;

public class BadPupil extends Pupil{
    BadPupil(){
        studyHour=2;
        readHour=1;
        writeHour=0;
        relaxHour=10;
    }
    void study(){
        studyHour=2;
    }
    void read(){
        readHour=1;
    }
    void write(){
        writeHour=0;
    }
    void relax(){
        relaxHour=10;
    }
}
