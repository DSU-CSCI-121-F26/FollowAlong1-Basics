package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s
//        starts at about 22:20 — stop at about 35:00, after he prints "Hello Bro"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 02 — variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Variables.
//    Leave the "package part02;" line and the "public class Variables" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Variables {
    public static void main(String[] args) {
        int x = 123;
        long val = 36976006;
        byte val2 = 100;
        double val4 = 3.14;
        boolean b1 = true;
        char c1 = '@';
        String s1 = "Hello Bro";

        // prints out the value that is stored in x.
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
