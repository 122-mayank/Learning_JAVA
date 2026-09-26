public class Demo_5{
     public static void main(String[] args) {
        //  Direction[] directions = Direction.values();

        //  for(Direction d : directions){
        //     System.out.println(d.name());
        //  }

         Direction d = Direction.valueOf("EAST");
         System.out.println(d.ordinal());
     }
}

//values () - compiler genearted code
// value of() - Convert a string in to enum constant
// name () vs toSring()
enum Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST;

    @Override
    public String toString(){
        return this.name() + " Direction";
    }
}