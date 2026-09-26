

public class Super_Keyword {

    public static void main(String[] args) {

        String name = "Mayank";
        int age = 22;

        EngineeringStudent es =
                new EngineeringStudent(name, age);

        es.markAttendence();
        es.attendLab();
    }
}

class Student_2 {

    String name;
    int age;

    Student_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void markAttendence() {
        System.out.println("Attendence Marked !!");
    }
}

class EngineeringStudent extends Student_2 {

    EngineeringStudent(String name, int age) {
        super(name, age);
    }

    public void attendLab() {
        System.out.println("Attend Lab");
    }
}