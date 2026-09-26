
import java.io.*;

public class Clone_Example{
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Mayank" , 23);

        Student s3  = (Student)s1.clone();
        System.out.println(s3.name + " " + s3.age);
    }
}

class Student extends  Object implements Cloneable{
    String name;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}