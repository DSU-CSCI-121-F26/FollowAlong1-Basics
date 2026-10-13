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

//this is the declaration for the template for all Variables in the variable class
public class Variables {
    // the start of the program
    public static void main(String[] args){
        //declaration of a variable thats an integer x
        int x;
        // assigning the variable x to 123
        x = 123;
        // prints 123
        System.out.println(x);
        // prints x
        System.out.println("x");
        // prints the concatenated my number is 123
        System.out.println("My number is " + x);
        // makes a variable called debt that is a long type and assigned the value of 3000000000
        long debt = 3000000000L;
        // prints 3000000000
        System.out.println(debt);
        // makes a variable called b thats a byte and its assigned to 100
        byte b = 100;
        // prints 100
        System.out.println(b);
        // makes a variable called y thats a float and its assigned to 3.14
        float y = 3.14f;
        // prints 3.14
        System.out.println(y);
        //  makes a variable called y2 thats a double and its assigned to 3.14
        double y2 = 3.14;
        // prints 3.14
        System.out.println(y2);
        // boolean variable called z and its assigned to true
        boolean z = true;
        // prints true
        System.out.println(z);
        // a variable of the character data type called symbol and its assigned to the @ symbol
        char symbol = '@';
        // prints @
        System.out.println(symbol);
        // a variable named name of the String data typer and its assigned to Bro
        String name = "Bro";
        // prints Hello Bro
        System.out.println("Hello " + name);
    }

}
