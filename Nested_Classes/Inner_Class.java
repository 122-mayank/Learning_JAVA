class Outer{

    int x =10;

    class Inner{

       int x = 20;

        void fun(){
            System.out.println(x);
            System.out.println(this.x); 
            System.out.println(Outer.this.x);
            System.out.println("Hello");
        }

    }
    
}

public class Inner_Class{
    public static void main(String[] args) {

        Outer outer = new Outer();

        System.out.println(outer.x);
        
        Outer.Inner inner = outer.new Inner();
        // i can also made object like this
        // Outer.Inner inner = new Outer().new Inner();
        inner.fun();
    }
}