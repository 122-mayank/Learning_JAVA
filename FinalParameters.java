public class FinalParameters {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.square(3));

        System.out.println(c.square(4));
    }
} 

class Calculator{
    int square(final int x){
        return x * x;
    }
}
