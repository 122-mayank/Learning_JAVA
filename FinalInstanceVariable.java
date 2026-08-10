class Student{
    final int rollNo;

    Student(int rollNo){
        this.rollNo = rollNo;
    }

    void display(){
        System.out.println("Roll Number: "+rollNo);
    }
}


public class FinalInstanceVariable {
    public static void main(String args[]){
       Student s1 = new Student(101);
       s1.display();
    }
}
