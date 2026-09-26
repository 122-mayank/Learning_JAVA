package Inheritance;

public class Basics {
    public static void main(String[] args) {

        EngineeringStudent es = new EngineeringStudent();
        es.markAttendence();
        es.attendLab();

        Student s1 = new Student();
        s1.markAttendence();

    }
}

class Student {

    String name;
    int age;

    void markAttendence() {
        System.out.println("Attendance Marked");
    }

}

class EngineeringStudent extends Student {

    void attendLab() {
        System.out.println("Labs Attended");
    }

}