package javaClass;

public class functionOfFunction {
    private int X1;
    private int X2;
    private int Y1;
    private int Y2;
    private double a;
    private boolean flag;
    double resultTotal=0;

    protected void setXY(int X1, int Y1,int X2,int Y2){
        this.X1 =X1;
        this.X2 =X2;

        this.Y1 =Y1;
        this.Y2 =Y2;
        flag= true;
    }


    private void calculateXY(){
       
        double resultX=0;
        double resultY=0;
       
        
        resultX=((X2-X1));
        resultY=((Y2-Y1));


        a=resultY/resultX;
        resultTotal= a*X1-Y1;
    }

    


    protected void setXN(int X1,int Y1,int a){    
        this.X1= X1;
        this.Y1= Y1;
        this.a=a;

        flag= false;
    }


    private void calculateXN(){
        int resultX=X1;
        int resultY=Y1; 
        

        a=resultY/resultX;
        resultTotal= a*X1-Y1;
    }



    protected void printResult(){        // output format "Y=ax+b"
       //    System.out.println(Y+"="+a+""+X+"+"+B);
       // y=ax+b;
       if(flag){
        calculateXY();
        System.out.println("Y="+a+"*"+X1+"+"+Y1);


       }else {
        calculateXN();
        System.out.println("Y="+a+"*"+X1+"+"+Y1); 
        System.out.println(resultTotal);

       }
    }
    
    
}
