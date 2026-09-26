final class Student{

    private final String name;
    private final int age;
    private final College college;

    Student(String name , int age , College college ){
         this.name = name;
         this.age = age;
         this.college = college;
    }

    //getters
    public String getName(){
         return name;
    }

    public int getAge(){
        return age;
    }

     public College getCollege(){
        return this.college;
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

public class Partial_Immutable_Class{
     public static void main(String[] args) {
        
        College c = new College("IIT G" , "Assam");
        System.out.println(c.getName());

        Student s = new Student("Mayank" , 23 , c);

        System.out.println(s.getCollege().name);

        s.getCollege().name = "IIT K";

        //it has changed the value beacsue it follows the shallow copy 
        // the same address is used in heap to modify the data
        // hence this is not immutable class 
        
        System.out.println(s.getCollege().name);
     }


     //We can add two rules either to make the fully immutable class.
     // 1) make the class as final 
     // 2) make the defensive copy of constructor and gtters(dep copy)
     // means assigning and returning new address so the s refernce 
     //varible of student points to object of college is different 
     // and every time it creates new object in heap 
     //hence modification does not allow in this 
}