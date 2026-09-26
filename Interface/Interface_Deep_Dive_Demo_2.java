public class Interface_Deep_Dive_Demo_2{
     public static void main(String[] args) {
         Random r1 = new Random();
         r1.fun();
     }
}

//Variables inside interfaces

interface MathConstant{
    double PI_VALUE = 3.14;
    int value = 10;
}

class Random implements  MathConstant{
    void fun(){
        System.out.println(PI_VALUE);
    }
}