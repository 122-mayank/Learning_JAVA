public class Autoboxing{

     static void printInteger(Integer x){
        System.out.println(x);
     }
     public static void main(String[] args) {
         int x = 10;

         Integer y = x; // autoboxing
         //Internally it performs
        // Integer y = Integer.valueOf(10);
         System.out.println(y); //unboxing why? because actually 
        //  y is reference 
        //  which is made by initializing the object 
         System.out.println(x);

         Integer z = new Integer(20); // it is deprecated
         Integer l = Integer.valueOf(100); // it is used now
         System.out.println(z);
         System.out.println(l);

         int value = 30;
         printInteger(value);

         //Null pointer exception in autoboxing
         Integer m = null;
         int n = m;

         //because the m is internally making the object and 
        //  when it assign in to n (primitive data type) so null is 
        // a object hence how it can be assign in to a n(primitive data types)
         System.out.println(n);

     }
}