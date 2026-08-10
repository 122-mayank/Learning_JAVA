
//Call by reference --> but indirectly it is call by value
public class CallByReference {
    public static void main(String[] args) {
        int x = 4 , y = 5;
        Random r1 = new Random(x , y);

        System.out.println("Before modify: "+ r1.x +" "+ r1.y);
        addTen(r1);
        System.out.println("After modify: "+ r1.x +" "+ r1.y);
        
    }

    static void addTen(Random r){
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}


class Random{
    int x;
    int y;

    Random(int x, int y){
        this.x = x;
        this.y = y;
    }
}