public class Demo_4{
    public static void main(String[] args) {
        Direction d = Direction.EAST;
        d.move();
    }
}

enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("North direction ( y + 1)");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("South direction ( y - 1)");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("East direction ( x + 1)");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("West direction ( x - 1)");
        }
    };
    public abstract void move();
}