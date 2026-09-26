package Protected_Modifiers.package_2;

import Protected_Modifiers.package_1.Student;

class TestAccess extends Student {

    public static void main(String[] args) {

        TestAccess t = new TestAccess();

        System.out.println(t.college);
    }
}