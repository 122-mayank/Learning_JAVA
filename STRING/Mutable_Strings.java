public class Mutable_Strings{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        sb.append("Mayank");
        sb.append(" Saini");
        sb.append("aaaaa");
        // 6 + 6 + 5 = 17
        // System.out.println(sb);

        // sb.insert(2 , 'o');
        // System.out.println(sb);

        // sb.delete(0,2);
        // System.out.println(sb);

        // sb.deleteCharAt(3);
        // System.out.println(sb);

        // sb.replace(1 , 3 , "XY");
        // System.out.println(sb);

        // sb.reverse();
        // System.out.println(sb);

        // sb.charAt(3);
        // sb.setCharAt(3, 'r');
        
        // System.out.println(sb.capacity());
        // sb.ensureCapacity(100);
        System.out.println(sb.capacity()); //34
        sb.trimToSize();
        System.out.println(sb.capacity()); //17



    }
}