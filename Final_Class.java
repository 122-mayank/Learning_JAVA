public class Final_Class{
    public static void main(String[] args) {
        Utility obj = new Utility();
        obj.showMessage();
    }
}

final class Utility{
    void showMessage(){
        System.out.println("This is a final class");
    }
}