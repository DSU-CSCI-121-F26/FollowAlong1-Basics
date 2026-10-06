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
        /* MY GUESS:
           7
           7.0
           a + b
           a: 7
           14
           // wrong because it did not add, it combine them as strings
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

        String name = "Destiny";
        int age = 22;
        double gpa = 2.5;
        boolean isCommuter = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Commuter: " + isCommuter);

        char d = 'D';
        int numclasses = 5;
        double credithr = 15;
        boolean hasJob = true;
        String major = "Computer Science";
        System.out.println(d + " takes " + numclasses + " classes in "
                + major + ", for " + credithr + " credit hours. Has a Job: " + hasJob);


        String city = "Dover";
        long people = 4000000000L;
        char grade = 'B';
        double temp = 72.5;
        System.out.println(city + " " + people + " " + grade + " " + temp);
    }




}
