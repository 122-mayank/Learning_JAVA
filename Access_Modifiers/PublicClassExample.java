public class PublicClassExample{
     public static void main(String args[]){
          Student s1 = new Student("Krishna");
          s1.display();
     }
}


class Student{
     public String name;

     public Student(String name){
          this.name = name;
     }

     public void display(){
          System.out.println("Name: "+name);
     }
}


