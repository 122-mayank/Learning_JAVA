class Employee{

    String name;
    int age;
    int rollno;


    Employee(String name){
         this(name ,0);
         System.out.println("Inside first constructor");
    }

    Employee(String name , int age){
         this(name , age , 0);
         System.out.println("Inside second constructor");
        
    }

    Employee(String name , int age , int rollno){
         this.name = name;
         this.age = age;
         this.rollno = rollno;
          System.out.println("Inside third constructor");
    }


}
public class Constructor2{
    
    public static void main(String[] args) {
        
    }

}