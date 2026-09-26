interface Animal{
    void sleep();
  
}

interface Dog{
    void eat();
}


class BabyDog implements Animal , Dog{

    @Override
    public void sleep(){
        System.out.println("Baby Dog is sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Baby Dog is eating");
    }

}


public class Interface_Practice_2{
     
     public static void main(String[] args) {

        BabyDog b = new BabyDog();
        b.eat();
        b.sleep(); 
         
     }

}