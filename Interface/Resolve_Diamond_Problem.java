interface A{

    void draw();

}

class B implements  A{

    @Override
    public void draw(){
         System.out.println("Draw B by A");
    }

}

class C implements  A{

    @Override
    public void draw(){
        System.out.println("Draw C by A");
    }

} 

class D implements A{

    B b = new B();
    C c = new C();

    @Override
    public void draw(){
         c.draw();
         b.draw();
    }

}

public class Resolve_Diamond_Problem{
     
     public static void main(String[] args) {
        
        D d = new D();
        d.draw();

        A a = new D();
        a.draw();

     }

}