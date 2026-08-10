public class StaticClass_Demo {
    public static void main(String[] args) {
        
        Student s1 = new Student("Mayank" , 21 , 15);
        System.out.println(s1.age);
        System.out.println(Student.College);

    }
}

class Student{

    String name;
    int age;
    int rollno;
    static String College;

    Student(String name , int age, int rollno){
        this.name = name;
        this.age = age; 
        this.rollno = rollno;
    }

    static{
        College ="IIT Kanpur";
    }
}
