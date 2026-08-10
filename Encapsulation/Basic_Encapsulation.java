import java.util.*;

public class Basic_Encapsulation{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        String name = sc.nextLine();

        System.out.println("Enter the marks ");
        int marks = sc.nextInt();

        System.out.println("Enter the RollNo ");
        int rollNo = sc.nextInt();

        Employee e = new Employee();
        e.setMarks(marks);
        e.setName(name);
        e.rollNo(rollNo);

        System.out.println("Name of the Student:"+ e.getName());
        System.out.println("Marks of the student: " + e.getMarks());
        System.out.println("ROll No of the student: "+ e.getRollNo());
        System.out.println("College of Student: "+ Employee.getCollege());
        e.getAttendence();

    }
}

class Employee{
    private String name;
    private static String College;
    private int marks;
    private int rollNo;

    static{
         College = "IIT Guwahati";
    }

    public static String getCollege() {
        return College;
    }

    void getAttendence(){
        System.out.println(name + " Present Sir");
    }

    void setName(String name){
        this.name = name;
    }

    void setMarks(int marks){
        if (marks >= 0 && marks <= 100) {
        this.marks = marks;
        } else {
        System.out.println("Invalid marks");
    }
    }
    void rollNo(int rollNo){
        this.rollNo = rollNo;
    }

    String getName(){
        return name;
    }

    int getMarks(){
      return marks;
    }

    int getRollNo(){
        return rollNo;
    }


    
}