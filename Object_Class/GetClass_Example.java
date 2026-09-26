public class GetClass_Example{
    public static void main(String[] args) {

        Student s1 = new Student("Mayank " , 23);
        System.out.println(s1.getClass().getName());
        
    }
}

class Student{

    String name;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }


}