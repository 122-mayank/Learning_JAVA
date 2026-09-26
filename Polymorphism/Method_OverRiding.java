class Animal{
    void run(){
        System.out.println("Animal runs");
    }
}

class Dog extends Animal{

  @Override
  void run(){
    System.out.println("Dog runs!!");
  }

}

class Duck extends Animal{
    @Override
    void run(){
        System.out.println("Duck swims!!");
    }

}

class Human extends  Animal{
    @Override
    void run(){
        System.out.println("Human runs!!");
    }

    void study(){
        System.out.println("Humans study their subjects!!");
    }
}
public class Method_OverRiding{
     public static void main(String[] args) {
         
         Animal human = new Human();
         human.run();

         Animal duck = new Duck();
         duck.run();

         Animal dog = new Dog();
         dog.run();
         

     }
}