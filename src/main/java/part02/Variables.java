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
        //declares an integer variable x
        int x;
        //variable x is 123
        x = 123;
        //prints My number is + that variable x
        System.out.println("My number is "+x);
        //variable debt with a long of 300,000
        long debt = 3000000000L;
        //prints debt
        System.out.println(debt);
        //variable be with a byte of 100
        byte b = 100;
        //prints the variable b which is 100
        System.out.println(b);
        //variable y float type
        float y = 3.14f;
        //prints y the variable in y
        System.out.println(y);
        //double variable y2 that prints 3.14
        double y2 = 3.14;
        //prints y2 the variable in y2
        System.out.println(y2);
        //variuable z with a boolean that returns true
        boolean z = true;
        //prints the variable z which is true
        System.out.println(z);
        //char variable symbol that is '@'
        char symbol = '@';
        //prints the character for @
        System.out.println(symbol);
        //variable name that returns the string bro
        String name = "Bro";
        //concatenate the name in hello
        System.out.println("Hello "+name);



    }
}
