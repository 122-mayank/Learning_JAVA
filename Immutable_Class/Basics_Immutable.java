

final class Student{

    private final String name;
    private final int age;

    Student(String name , int age){
         this.name = name;
         this.age = age;
    }

    //getters
    public String getName(){
         return name;
    }

    public int getAge(){
        return age;
    }
}


public class Basics_Immutable{
    public static void main(String[] args) {

        Student s1 = new Student("Mayank" , 23);

        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        
    }
}