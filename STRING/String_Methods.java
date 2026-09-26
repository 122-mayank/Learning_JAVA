public class String_Methods{
    public static void main(String args[]){
        //  String s1 = new String("Mayank");
         String s2 = new String("Krishna");

        //  System.out.println(s1.length());
        //  System.out.println(s1.isEmpty());
        //  System.out.println(s1.isBlank());


        //  //Character Acces
        //  System.out.println(s1.charAt(3));
        //  char arr[] = s1.toCharArray();
        //  for(int i = 0 ; i< arr.length ;i++){
        //     System.out.print(arr[i]);
        //  }
        //  System.out.println();
        //  //Comparison
        //  System.out.println(s1.equals(s2));
        //  System.out.println(s1 == s2);

        //  //actually it ignores the upper case and lower case
        //  System.out.println(s1.equalsIgnoreCase(s2));

        //  //compares the value lexicographically gives the op as integer value
        // //  +ve , -ve , 0 , +ve means s1 is greater than s2
        // // -ve means s2 is greater than s1
        // //  0 means the same as the s1 == s2

        //  System.out.println(s1.compareTo(s2));

        //  //Searching
        //  System.out.println(s1.contains("yank"));
        //  System.out.println(s1.indexOf("ya"));
        //  System.out.println(s1.lastIndexOf('a'));

        //  System.out.println(s1.startsWith("Ma"));

        //  //Extraction and Transformation
        //  System.out.println(s1.substring(1, 5));
        //  //last index -> exclusive , start index -> inclusive

        //  System.out.println(s1.toUpperCase());
        //  System.out.println(s2.toUpperCase());

        //  System.out.println(s1.trim());
        //  //trim is used to remove the white spaces at end or start
        //  System.out.println(s1.strip());
        //  // strip is same as trim but it is unicode friendly

        //  System.out.println(s2.repeat(3));
        //  System.out.println(s1.replace('y', 'K'));
        //  System.out.println(s2.replace("rish", "adha"));

        String s3 = "Aditya-Rohit-Rohan";
        String arr3[] = s3.split("-");
        for(String s : arr3){
            System.out.println(s);
        }

        //join is a static funtion
        System.out.println(String.join("-", "a","b","c"));

        //Conversion
        String s4 = new String(String.valueOf(10));
        byte arr4[] = s2.getBytes();
        for(byte b : arr4){
            System.out.print(b + " ");
        }

        //intern and format
        String s5 = new String("Hello");
        String s6 = s5.intern();

        //intern() moves the object of Hello  from Heap to string pool 

        System.out.println(s5 == s6);

        //format
        String name = "Mayank";
        int age = 21;

        //Hello Mayank, you age is 28;
        System.out.println("Hello" + " "+ name + ", " + "your age is " + age);
        System.out.println(String.format("Hello %s, your age is %s", name , age));
    }
}