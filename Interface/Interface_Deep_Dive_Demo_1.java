public class Interface_Deep_Dive_Demo_1{
    public static void main(String[] args) {
        Payment p = new DebitCard();
        p.pay();
    }
}

interface Payment{
    void pay();
}

class DebitCard implements  Payment{
     public void pay(){
          System.out.println("Paying via DebitCard !!");
     }
}
class CreditCard implements Payment{
     public void pay(){
        System.out.println("Paying via CreditCard !!");
     }
}

// interface Car{
//     void drive();
// }

// class Thar implements Car{
//     @Override
//      public void drive(){
//         System.out.println("Thar is driving");
//      }
// }