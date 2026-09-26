package Inheritance;

public class MultiLevel_Inheritance {

    public static void main(String[] args) {

        CSEEngineeringStudent cse = new CSEEngineeringStudent();

        cse.attendCSELab();
        cse.attendLab();

    }
}

class Student {

    String name;
    int age;

    public void markAttendance() {
        System.out.println("Attendance Marked");
    }
}

class EngineeringStudent extends Student {

    public void attendLab() {
        System.out.println("Attend the Lab");
    }
}

class CSEEngineeringStudent extends EngineeringStudent {

    public void attendCSELab() {
        System.out.println("Complete the code in the Lab !!");
    }
}