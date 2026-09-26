


class A{
    final int getX(){
        return 10;
     }
}

//this is not valid 
// beacuse the final methods are not overriden
// class B extends  A{
//     final int getX(){
//          return 20;
//     }
// }

class B{
     int getX(){
        return 20;
     }
}

public class final_Keyword{
     public static void main(String[] args) {
        
        B b = new B();
        System.out.println(b.getX());

     }
}