package homework3;

public class GoodPupil extends Pupil{
    GoodPupil(){
        studyHour=6;
        readHour=2;
        writeHour=1;
        relaxHour=5;
    }
    void study(){
        studyHour=6;
    }
    void read(){
        readHour=2;
    }
    void write(){
        writeHour=1;
    }
    void relax(){
        relaxHour=5;
    }
}
