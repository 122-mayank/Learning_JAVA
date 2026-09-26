
class A{

    private void fn(){
         System.out.println("A called !!");
    }

}

//private methods are not overriden 


class B extends  A{

private void fun(){
     System.out.println("B called !!");
}

}

public class Private_Keyword{
     public static void main(String[] args) {
         
         B b = new B();
    //  b.fun(); ..this will get error as we know 
    // the private method is acces through the getter and setter 

     }
}