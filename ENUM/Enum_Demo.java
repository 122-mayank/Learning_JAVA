public class Enum_Demo{
     public static void main(String[] args) {
        //  int status = PaymentStatus.SUCCESS;

        // System.out.println(status);

        int status2 = 100;

        // if(status == Role.ADMIN){

        // }

        String status = PaymentStatus.FAILED;
        System.out.println(status);

        if(status == "success"){
            System.out.println();
        }

     }
}

//Problems 
/*
1. Type Safety we can give any value status = 100 but
it can not be valid
2. Poor Readability 
if(status == 2){

}
hme ye nahi pta kii hm kis 2 ki baat kar rhe hai 
bar bar hme Payment Status class dekhna padega

3. No Grouping and related entities
 
 */

class PaymentStatus{
    public static final String SUCCESS = "Success";
    public static final String FAILED = "Failed";
    public static final String PENDING = "Pending";
}

class Role{

public static final int USER = 1;
public static final int ADMIN = 2;

}