package Protected_Modifiers.package_1;

public class Student {

    public String college = "IIT Kanpur";
    int age = 21;

    public void showCollege() {
        System.out.println("College " + college);
    }

    void showAge() {
        System.out.println("Age " + age);
    }
}