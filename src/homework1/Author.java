package homework1;

public class Author {
    String nameAuthor;
    Author(){}
    Author(String nameAuthor){
        this.nameAuthor=nameAuthor;
    }
    void setNameAuthor(String nameAuthor){
        this.nameAuthor=nameAuthor;
    }
    void show(){
        System.out.print(nameAuthor+"\n");
    }
}
