public class Interface_Deep_Dive_Demo_3{
     public static void main(String[] args) {
         
     }
}

//Multiple Inheritance --> suports through the interfaces

interface  A{

    void fun();
}
interface B{
    void fun2();
}

class C implements A , B{
    @Override
    public void fun(){

    }
    @Override
    public void fun2(){

    }
}

