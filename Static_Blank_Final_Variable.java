
class Config{

    static final int MAX_USERS;

    static{
        MAX_USERS = (int) (Math.random() * 100) + 1;
    }
}

public class Static_Blank_Final_Variable {
    public static void main(String[] args) {
        System.out.println(Config.MAX_USERS);
    }
}
