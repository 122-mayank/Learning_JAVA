
/*

Use cases of static nested classes
1. As helper class for any outer class
2. Builder Design pattern
3. If you want to have static methods inside a nested class
4. Request/Response DTO , 

*/



public class Static_Nested_Classes{
     public static void main(String[] args) {
         
         Outer outer = new Outer();

         //make the object of static nested class
         Outer.Inner inner = new Outer.Inner(outer);
         inner.fun();
     }
}

//static Nested
class Outer{

     static int x = 30;

    int y;
    
    static class Inner{

        Outer outer;

        Inner(Outer outer){
             this.outer = outer;
        }

        void fun(){
            System.out.println(x);
            System.out.println(outer.y);
        }
    }

}

class BankAccount{

     //this below static class act as a helper its methods can be called by the other
    //  method
    private static class InterestCalculator{

       static double calculateYearly(double principal , double rate){
            return principal * rate;
        }

    }

    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal , 0.09);
    }


}