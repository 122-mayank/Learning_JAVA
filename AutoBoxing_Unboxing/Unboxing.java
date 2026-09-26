


public class Unboxing{
     public static void main(String[] args) {
         
         Integer y = Integer.valueOf(100);
        //  int x = y; //Unboxing
         //Internally it does
        //   x = y.intValue();

        int x = y.intValue();  // Unboxing can be does with it also
         System.out.println(x);
         System.out.println(y);

         Integer l = 200;
         Integer m = 200;
         System.out.println(l == m);

     }
}