
//Anonymous Class -> class when we used at once

public class Anonymous_Class{
     public static void main(String args[]){

        // Person p1 = new Person();
        // p1.introduce();

        // Person p2 = new Guest();
        // p2.introduce();

        Person p2 = new Person(){
            String name ="Mayank";
            @Override
            void introduce(){
                System.out.println("Hi , I am a Guest");
            }

            void greet(){
                System.out.println("Hello !!");
            }
        };
        p2.introduce();
     }
}

class Person{
    void introduce(){
        System.out.println("Hi, I am a Person");
    }
}
// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("Hi, I am a Guest");
//     }
// }