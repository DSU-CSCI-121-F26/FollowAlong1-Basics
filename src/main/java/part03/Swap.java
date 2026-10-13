package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// defines a publicly accessed class called swap
public class Swap {
    // the start of the program called main
    public static void main(String[] args) {
        // initialization of string variables called x and y for water and kool-aid
        String x = "water";
        String y = "Kool-Aid";
        // declaration for a string variable temp
        String temp;

        // assignees temp to x which is water
        temp = x;
        // y is assigned to x and y holds Kool-Aid
        x = y;
        // y is assigned to the temp which is water
        y = temp;

        // prints x: water
        System.out.println("x: " + x);
        // prints y: Kool-Aid
        System.out.println("y: " + y);




    }

}
