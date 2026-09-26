import java.io.IOException;

public class Stream_Java{
     public static void main(String[] args) throws IOException {
        int x =  System.in.read(); // it only gives the integer value
        // as return type 
        System.out.println((char)x);
     }
}