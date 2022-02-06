package homework1;

import java.util.Scanner;

public class HelperWrite {
    int valueInt;
    double valueDouble;
    String valueString;
    HelperWrite(){}
    HelperWrite(int valueInt){
        this.valueInt=valueInt;
    }
    HelperWrite(double valueDouble){
        this.valueDouble=valueDouble;
    }
    HelperWrite(String valueString){
     this.valueString=valueString;
    }
    public int setValuesInt(){
        Scanner in = new Scanner(System.in);
        valueInt = in.nextInt();
        return valueInt;
    }
    public double setandgetValuesDouble(){
        Scanner in = new Scanner(System.in);
        valueDouble = in.nextDouble();
        return valueDouble;
    }
    public String setValuesString(){
        Scanner in = new Scanner(System.in);
        valueString = in.next();
        return valueString;
    }
}
