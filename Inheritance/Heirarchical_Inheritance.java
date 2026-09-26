package Inheritance;

public class Heirarchical_Inheritance {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name="Mayank";
        s1.age= 23;
        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.markAttendence();
    }
}


class Student{
    String name;
    int age;

    void markAttendence(){
         System.out.println("Attendence Marked");
    }
}

class EngineeringStudent extends Student{

    void attendLab(){
        System.out.println("Attend the Lab");
    }

}

class CSEEngineeringStudent extends Student{
    void attendCSELab(){
        System.out.println("Attende the CSE Lab");
    }
}

//Heierarchical Inheritance

//    A
//  /   \
// B     C