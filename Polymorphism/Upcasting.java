class Vehicle {
    void start() {
        System.out.println("Vehicle has started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
    void brand() {
        System.out.println("Brand: Kia");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
    void type() {
        System.out.println("Type: Sports Bike");
    }
}

class Bus extends Vehicle {
    @Override
    void start() {
        System.out.println("Bus starts with a button");
    }
    void capacity() {
        System.out.println("Capacity: 50 passengers");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        // Upcasting examples
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        // Dynamic method dispatch
        v1.start(); // Car's start()
        v2.start(); // Bike's start()
        v3.start(); // Bus's start()


           //Above Methods are not call
         // it is not accesible because the parent
        //  has only acces to its method and 
        // those methods are overridden by child

        // But subclass-specific methods are hidden
        // v1.brand(); ❌ Not accessible
        // v2.type(); ❌ Not accessible
        // v3.capacity(); ❌ Not accessible
    }
}
