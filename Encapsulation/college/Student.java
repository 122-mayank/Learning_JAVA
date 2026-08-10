package college;

public class Student {
     public void print(){
        System.out.println("College Student");
    }
}


class Teacher{
    void print(){
        Student s1 = new Student();
        s1.print();
    }
}