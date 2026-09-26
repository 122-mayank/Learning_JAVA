public class Private_Modifier
{
     public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Mayank");
        e.showRollNo();
     }
}

 class Employee{

    private String name;

    public void setName(String name){
        this.name = name;
    }
     public void showRollNo(){
         System.out.println("Name: "+name);
    }
}