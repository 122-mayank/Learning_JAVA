abstract class Animal{
    static String type;

    private void play(){
        System.out.println("Animal can play");
    }

    final void walk(){
         System.out.println("Animal can walk");
    }

    static void eat(){
         System.out.println("Eating the food ");
    }
     abstract void makeSound();

     String name;
     Animal(String name){
        this.name = name;
     }

     void sleep(){
         System.out.println("Sleeping");
     }
}

class Dog extends  Animal{

    Dog(String name){
        super(name);
    }

     @Override
     void makeSound(){
         System.out.println("Making barking sound");
     }
}


public class Abstract_Classes{
     public static void main(String[] args) {
         Animal a = new Dog("Tommy");
         a.makeSound();
         a.sleep();
     }
}

//Interview Questions
//Q-1 Can abstract classes have constructors ? -> yes
//Q-2 Can abstract classes is final ?  - No //
// because the final class can not be inherited 
//Q-3 Can abstract class have static methods / variables  -> yes
//Q-4 Can abstract class have private method ? // yes but non abstract
//Q-5 Can abstract classes have final methods ? --> yes but non abstract
//Q-6 Can abstract classes have no abstract method ? -> yes