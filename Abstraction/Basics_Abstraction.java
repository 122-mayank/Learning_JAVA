
abstract class Car{

    public void start(){
       System.out.println("Car has started!!");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car{

       @Override
       public void accelerate(){
         System.out.println("Fuel Car has accelerated method");
       }
       @Override
       public void brake(){
        System.out.println("Fuel Car has brake method");
       }

}

class ElectricCar extends Car{

    @Override
    public void accelerate(){
        System.out.println("Electric Car has some accelearte");
    }

    @Override
    public void brake(){
        System.out.println("Electric Car has some brake method");
    }

}

public class Basics_Abstraction{
     public static void main(String[] args) {
    
      Car c = new ElectricCar();
      c.accelerate();
      c.brake();

      Car b = new FuelCar();
      b.accelerate();
      b.brake();
        
     }
}
