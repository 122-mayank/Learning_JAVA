class A{
     public void show(){
         System.out.println("A");
     }
}

class B extends A{
     @Override
     public void show(){
         System.out.println("B");
     }
}

class C extends A{
     @Override
     public void show(){
        System.out.println("C");
     }
}

// diamond Problem
// Wrong -> the error '{' is token expected
// class D extends B , C {

// }

public class Diamond_problem{
     public static void main(String[] args) {
         
     }
}