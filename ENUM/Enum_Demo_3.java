public class Enum_Demo_3{
    public static void main(String[] args) {
        Direction d = Direction.EAST;
        System.out.println(d.getDegree());
    }
}

enum Direction{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);
    private int degree; //it is a variable of 
    // the these objects North,South,East,West

    Direction(int degree){
        this.degree = degree;
    }

    public int getDegree(){
        return this.degree;
    }
}