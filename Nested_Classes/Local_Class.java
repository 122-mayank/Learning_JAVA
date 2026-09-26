public class Local_Class{
     public static void main(String[] args) {
         Outer outer = new Outer();
         outer.greet();
     }
}

class Outer{

    static private int x = 4;

    void greet(){
        int y = 5;
        // y++; //it gives error beacuse java do no allow to 
        // change the value of y because internally
        // it is a effectively final this happens beacuse greet is a 
        // local method and when its scope is destroyed from call stack
    // hence the local class scope is destroyed but the reference
    // variable is still there   Local local = new Local(); so object is 
    // cretaed still in heap memory

    // Hence java copies the varible of like y = 5 in local class so that further
    // any refernce is acces so that it can print the value 
    // hence it is effectively final

        class Local{
             void sayHello(){
                 System.out.println(x + " " + y);
             }
        }

        Local local = new Local();
        local.sayHello();
    }

}