package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /* My Guess:
        7
        7.0
        a + b
        a: 7
        77
        14!
        A
        true
         */
        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);

        //B1
        String name = "Juwan";
        int age = 20;
        double GPA = 3.31;
        boolean awake = true;

        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("GPA: " + GPA);
        System.out.println("awake: " + awake);

        //B2
        char ch = 'S';
        int num = 1;
        double dub = 2.0;
        boolean state = false;
        String names = "chud";

        System.out.println("secret spy " + ch +" is taking " + num + " class for " + dub +" credits. Can S fly: "+ state + ". whats agent S's real name "+ names);

        // B3
        String city = "Dover";
        long people = 4000000000l;
        char grade = 'B';
        float temp = 72.5f;
        System.out.println(city + " " + people + " " + grade + " " + temp);

    }
}
