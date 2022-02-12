package homework36;

import java.util.Random;

public class Printer {
    String[] colorLine=new String[]{"\u001B[0m", "\u001B[30m", "\u001B[31m", "\u001B[32m",
        "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m"};
    void print(String value){
        final Random random = new Random();
        System.out.println(colorLine[(random.nextInt(7)+1)]+value+colorLine[0]);
    }
}
