
class A{

    static void getFun(){
        System.out.println("Heloo!!");
    }
}


//static methods are belong to class
//   they are not overriden 

class B extends  A{

    static void getFun(){
         System.out.println("HIIII");
    }

}

public class Static_Keyword{
     public static void main(String[] args) {
         
         B.getFun();

         A.getFun();

     }
}