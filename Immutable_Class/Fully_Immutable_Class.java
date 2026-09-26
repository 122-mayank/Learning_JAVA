final class Student{

    private final String name;
    private final int age;
    private final College college;

    Student(String name , int age , College college ){
         this.name = name;
         this.age = age;
         this.college = new College(college.name , college.address);
    }

    //getters
    public String getName(){
         return name;
    }

    public int getAge(){
        return age;
    }

     public College getCollege(){
        return new College(college.name , college.address);
    }
}


class College{

    String name;
    String address;

    College(String name , String address){
         this.name = name;
         this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}

public class Fully_Immutable_Class{
     public static void main(String[] args) {
         
         College c = new College("IIT G" , "Assam");
        System.out.println(c.getName());

        Student s = new Student("Mayank" , 23 , c);

        System.out.println(s.getCollege().name);

        s.getCollege().name = "IIT K";
         System.out.println(s.getCollege().name);

     }
}