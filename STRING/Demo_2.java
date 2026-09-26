public class Demo_2{

    public static void main(String args[]){
        String s = "Hello";
        s = s + " World";
        System.out.println(s);

        char arr[] = {'M','a','y','a','n','k'};
        String s2 = new String(arr, 0 , 4);
        System.out.println(s2);

        byte arr2[] = {97 , 98 , 99};
        String s3 = new String(arr2);
        System.out.println(s3);

        //StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        String s8 = new String(sb);
        System.out.println(s8);

    }
}