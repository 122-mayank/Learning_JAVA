class Student{

    String name;
    int age;
    static String College;

    // static String College = "IIT Kanpur";

    static{
     College = "IIT Kanpur";
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }

    
}

public class Constructor {
    public static void main(String args[]){

        Student s = new Student("Mayank" , 23);
        s.display();

        System.out.println(Student.College);
    }
}
