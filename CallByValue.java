public class CallByValue {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        System.out.println("Before modify: "+ x +" "+ y);
        addTen(x , y);
        System.out.println("After modify: "+ x + " "+ y);
    }

    static void addTen(int x , int y){
         x = x+ 10;
         y = y + 10;
    }
}
