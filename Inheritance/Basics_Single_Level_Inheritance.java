package Inheritance;

public class Basics_Single_Level_Inheritance {
     public static void main(String[] args) {

        EngineeringStudent es = new EngineeringStudent();
        es.attendLab();
        es.markAttendence();
        
     }
}

//Parent Class
class Student {

    String name;
    int age;

    void markAttendence() {
        System.out.println("Attendance Marked");
    }

}


//child class

class EngineeringStudent extends Student {

    void attendLab() {
        System.out.println("Labs Attended");
    }

}