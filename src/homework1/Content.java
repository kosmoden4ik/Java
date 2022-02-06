package homework1;

public class Content {
    String textContent;
    Content(){}
    Content(String textContent){
        this.textContent=textContent;
    }
    void setTextContent(String textContent){
        this.textContent=textContent;
    }
    void show(){
        System.out.print(textContent+"\n");
    }
}
