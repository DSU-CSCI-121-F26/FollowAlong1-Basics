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

// Defines a class named Variables
public class Variables {

    // Defines the main method, where the program starts running
    public static void main(String[] args) {

        // Declares an integer variable named x
        int x;

        // Assigns the value 123 to the variable x
        x = 123;

        // Prints "My number is" followed by the value stored in x
        System.out.println("My number is " + x);

        // Declares a long variable named debt and assigns it the value 3,000,000,000
        // The L tells Java that this number is a long
        long debt = 3000000000L;

        // Prints the value stored in the debt variable
        System.out.println(debt);

        // Declares a byte variable named b and assigns it the value 100
        byte b = 100;

        // Prints the value stored in the b variable
        System.out.println(b);

        // Declares a float variable named y and assigns it the value 3.14
        // The f tells Java that this number is a float
        float y = 3.14f;

        // Prints the value stored in the y variable
        System.out.println(y);

        // Declares a double variable named y2 and assigns it the value 3.14
        double y2 = 3.14;

        // Prints the value stored in the y2 variable
        System.out.println(y2);

        // Declares a boolean variable named z and assigns it the value true
        boolean z = true;

        // Prints the value stored in the z variable
        System.out.println(z);

        // Declares a char variable named symbol and assigns it the @ character
        char symbol = '@';

        // Prints the character stored in the symbol variable
        System.out.println(symbol);

        // Declares a String variable named name and assigns it the text "Destiny"
        String name = "Destiny";

        // Prints "Hello" followed by the value stored in the name variable
        System.out.println("Hello " + name);
    }
}
