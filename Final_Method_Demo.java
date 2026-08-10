public class Final_Method_Demo {
   public static void main(String[] args) {
      Parent p1 = new Parent();
      p1.display();
   } 
}

class Parent{
    final void display(){
        System.out.println("Parent is displayed !!");
     }
}

class Child extends Parent{
    //void display is not extends due to final keywords
    //beacuse the final methods are not overriden
    //ok
}