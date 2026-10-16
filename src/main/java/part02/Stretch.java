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
        int a = 7;
        double b = 7;
        char c = 'A';
        boolean on = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        System.out.println(c);
        System.out.println(on);

        /*
        It is going to print out all the outputs like the values that are assigned to the ints
        or doubles so every value. When it has this in front "", it prints out the code value for the
        values. And boolean prints out the value true
         */

        String name = "Jordan Smith";
        int age = 19;
        double gpa = 3.4;
        boolean commuter = false;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Commuter: " + commuter);

        String city = "Dover";
        long people = 400000000;
        char grade = 'B';
        double temp = 72.5;
        System.out.println(city + " " + people + " " + grade + " " + temp);


    }

}
