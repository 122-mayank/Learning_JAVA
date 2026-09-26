public class Interface_Deep_Dive_Demo_4{
    public static void main(String[] args) {
        StreetDog s = new StreetDog();
        s.bark();
        s.eat();
    }
}

//Interface Inheritance
interface Animal{
    void eat();
}

interface Dog extends Animal{
    void bark();
}

class StreetDog implements Dog{

    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void bark(){
        System.out.println("Barking");
    }

}