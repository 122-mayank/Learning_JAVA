public class Demo_1{
     public static void main(String[] args) {
         String s1 = new String("Hello");
         String s2 = new String("Hello");
         System.out.println(s1.equals(s2));

         //case 1 
         String m1 = "ja" + "va";
         String m2 = "java";

         System.out.println(m1==m2);

         //case 2
         String l1 = "ja";
         String l2 = l1 + "va";
         String l3 = "java";

         System.out.println(l2 == l3);

     }
}