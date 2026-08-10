package Inheritance;

public class Basics_Inheritance {
    public static void main(String[] args) {

        EngineeringStudent es = new EngineeringStudent();
        es.markAttendence();
        es.attendLab();

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