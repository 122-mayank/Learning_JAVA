public class Enum_Demo_2{
     public static void main(String[] args) {
        //  int status = PaymentStatus2.SUCCESS;


        PaymentStatus status = PaymentStatus.SUCCESS;
        // PaymentStatus status = 100; it gives error 

        System.out.println(status.name());
     }
}

//Enum - Enumertaions (Enumerated)
// predfined set of constants

enum PaymentStatus{
     SUCCESS,
     FAILED,
     PENDING;
}    

class PaymentStatus2{
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}