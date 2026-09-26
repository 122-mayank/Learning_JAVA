public class Interface_Deep_Dive_Demo_5{
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();

        Vehicle.brake();
    }
}
//After Java 8 --> Deafult Methods , static methods
// From Java 9 --> it containes private methods
interface  Vehicle{
    default  void drive(){
        System.out.println("Vehicle is driving");
        accelerate();
    }

    static void brake(){
         System.out.println("Vehicle is applying the brake");
    }
    private void accelerate(){
        System.out.println("Vehicle is accelerating");
    }

}

// by default the methods in interface is public and abstract 

class Car implements  Vehicle{
    //  @Override
    //  public void drive(){
    //     System.out.println("Car is Driving");
    //  }
}