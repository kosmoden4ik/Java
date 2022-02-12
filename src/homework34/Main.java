package homework34;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    final int KEYPRO=1;
     final int KEYEXP=2;
    Scanner in = new Scanner(System.in);
    System.out.println("Введите ключ доступа: ");
    int keyUser = in.nextInt();
        DocumentWorker blancDocument;
    switch(keyUser){
        case (KEYPRO):
      blancDocument=new ProDocumentWorker();
      break;
        case KEYEXP:
       blancDocument=new ExpertDocumentWorker();
            break;
        default:
        blancDocument=new DocumentWorker();
            break;
    }
    blancDocument.openDocument();
    blancDocument.editDocument();
    blancDocument.saveDocument();
    }
}
