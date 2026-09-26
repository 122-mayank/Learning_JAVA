public class Equal_Operator{
     public static void main(String[] args) {
         int x = 200;
         int y = 200;

          System.out.println(x == y);

          Integer l = 400;
          Integer m = 400;
    // here the l == m defines the refrence varible 
    //  and it compares the address of l and m it stores 
        
    // as new keyword is creating object and the reference it stored 
        //  on l and m 
         System.out.println(l == m);

         System.out.println(l.intValue() == m.intValue() );

     }
}