public class Interface_Deep_Dive_Demo_7{
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}

//Java Resolution priority rule
// class function is more priority than interface if same method is there
interface  A{
    default void fun(){
        System.out.println("Inside A inteface");
    }
}

class B{
    public void fun(){
        System.out.println("Inside B class");
    }
}

class C extends B implements A{

    @Override
    public void fun(){
        System.out.println("Inside C class");
    }

}