package part01;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=750s
//        rewatch 12:30–17:30 if you forget how print, \n, \t, \" or \\ work
// Guide: GUIDE.md in this folder, steps 3–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        int x = 123;
        long val = 369760067;
        byte val2 = 100;
        double val4 = 3.14;
        boolean b1 = true;
        char c1 = '@';
        String s1 = "Hello Bro";

        // prints out the value that is stored in x
        System.out.println(x);
        // just prints out x like the character on the keyboard
        System.out.println("x");
        // prints out the number as well with a sentence that states what the number is then the number
        System.out.println("My number is " + x);
        // prints out the long value that is stored with the name val
        System.out.println(val);
        // prints out the byte that is stored with the name val2
        System.out.println(val2);
        // prints out the double value stored under the name val4
        System.out.println(val4);
        // prints out the boolean decision which for this instance is true
        System.out.println(b1);
        // prints out the @ symbol
        System.out.println(c1);
        // prints out the string and the input that is tagged along with it
        System.out.println(s1);
    }
}
