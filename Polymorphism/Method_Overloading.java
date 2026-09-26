
class Maths{

  void sum(int a , int b ){
     System.out.println("Sum of two number "+ (a + b));
  }

  void sum(int a,int b , int c){
     System.out.println("Sum of three numbers "+ (a + b + c));
  }

}

public class Method_Overloading{
    public static void main(String[] args) {

        Maths m = new Maths();
        m.sum(23, 34);
        m.sum(23 , 12 , 45);
        
    }
}