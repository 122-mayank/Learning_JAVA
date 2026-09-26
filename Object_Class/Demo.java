import java.util.*;
public class Demo{
    public static void main(String[] args) {

        Student s1 = new Student("Mayank" , 21);
        Student s2 = new Student("Mayank" , 21);

        System.out.println(s1.equals(s2));

        Student s3 = null;
        System.out.println(s1.equals(s3));

        Integer i = 20;

        System.out.println(s1.equals(i));
        System.out.println(s1.hashCode() == s2.hashCode());
        // s1 is same as s1.toString() both give same output
    }
}

class Student{
    String name;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return (name +" "+ age);
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null){
            return false;
        }
        //Check if both classes are type of Student
        //If not checked  -> Class Cast Exception
        if(obj.getClass() != this.getClass()){
            return false;
        }

        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name , age);
    }
}