public class Private{
     public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Mayank");
        e.showRollNo();
     }
}

 class Employee{

    private String name;

    void setName(String name){
        this.name = name;
    }
     void showRollNo(){
         System.out.println("Name: "+name);
    }
}