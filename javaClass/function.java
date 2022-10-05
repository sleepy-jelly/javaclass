package javaClass;
import java.util.Scanner;
public class function {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        functionOfFunction fof =new  functionOfFunction();

        int X1,X2,Y1,Y2,a;
        
        

        X1=sc.nextInt();
        Y1=sc.nextInt();
        X2=sc.nextInt();
        Y2=sc.nextInt();


        fof.setXY(X1,Y1,X2,Y2);
        fof.printResult();

        

        X1=sc.nextInt();
        Y1=sc.nextInt();
        a=sc.nextInt();
        fof.setXN(X1,Y1, a);
        fof.printResult();


        
        sc.close();
    }
}
