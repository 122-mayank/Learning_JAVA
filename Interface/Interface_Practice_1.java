
interface Animal{
     void sleep();
     void eat();

     default void walk(){
         System.out.println("Every animal walks");
     }
}

class Dog implements  Animal{
     @Override
     public void sleep(){
        System.out.println("Dog sleeps!!");
     }

     @Override
     public void eat(){
         System.out.println("Dog eats !!");
     }

     @Override
     public void walk(){
         System.out.println("Dog walks");
     }
}

class Cat implements Animal{

   @Override
   public void sleep(){
    System.out.println("Cat sleeps!!");
   }

   @Override
   public void eat(){
      System.out.println("Cat eats!!");
   }
}


public class Interface_Practice_1{
     public static void main(String args[]){
          
          Animal d = new Dog();
          d.sleep();
          d.eat();
          d.walk();

          Animal c = new Cat();
          c.sleep();
          c.eat();
          c.walk();

     }
}