public class Basics{
     public static void main(String[] args) {
        
        Student s = new Student("Mayank", 21 , 90 , "AXIS");
        System.out.println(s.name);

        s.markAttendence();

     }
}

class Student{
    
    //Instance variables
    String name;
    int age;
    int marks;
    String College;

    Student(String name , int age , int marks , String College){
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.College = College;
    }

   public  void markAttendence(){
        System.out.println("Attendence marked");
    }


}