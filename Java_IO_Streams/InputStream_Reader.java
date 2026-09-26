import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream_Reader{
     public static void main(String[] args) throws IOException{
         
         InputStreamReader isr = new InputStreamReader(System.in);

         BufferedReader bfr = new BufferedReader(isr);

         String name = bfr.readLine();

        System.out.println(name);
     }
}

//Flow
/*

 1. Aditya write in to console ->ip
 2.Os Buffer (65 ,100 , 105 ,116 ,  121 , 97)
 3.System.in (InputStream ) receives bytes 
 4.InputStreamReader -> stream of bytes in to stream of characters
  ('a' , 'd' , 'i' , 't' , 'y' , 'a')
 5. BufferedReader -> readLine -> Aditya -> name
 6. Aditya -> op
 */