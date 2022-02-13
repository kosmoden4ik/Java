package homework41;

public class Main {
    public static void main(String[] args) {
        AbstractHandler document=new XMLHandler();
        document.open();
        document.create();
        document.change();
        document.save();
    }
}
