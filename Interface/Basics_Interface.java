interface Car{
    void start();
    void accelerate();
    void brake();
}

class ElectricCar implements  Car{

    public void start(){
        System.out.println("Electric Car has started!!");
    }

    public void accelerate(){
        System.out.println("Electric Car has acclerated at 45km/hr");
    }

    public void brake(){
        System.out.println("Electric Car has applied brake at 65 km/hr");
    }

}

class FuelCar implements Car{

   public void start(){
    System.out.println("FuelCar has started!!");
   }

   public void accelerate(){
    System.out.println("FuelCar has acclerated at 34km/hr");
   }
   public void brake(){
    System.out.println("FuelCar has applied brake at 67km/hr");
   }

}

public class Basics_Interface{
    public static void main(String[] args) {

        Car c = new FuelCar();
        c.accelerate();
        c.brake();
        c.start();

    }
}