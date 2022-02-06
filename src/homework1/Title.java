package homework1;

public class Title {
    String nameTitle;
    Title(){}
    Title(String nameTitle){
        this.nameTitle=nameTitle;
    }
    void setTitle(String nameTitle){
        this.nameTitle=nameTitle;
    }
    void show(){
        System.out.print(nameTitle+"\n");
    }
}
