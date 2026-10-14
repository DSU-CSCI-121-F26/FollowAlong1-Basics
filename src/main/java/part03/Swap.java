//
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

public class Swap {
    public static void main(String[] args) {
        // we have a datatype string named x that holds the string water
        String x ="water";
        // we have a datatype string named y that holds the string Kool-Aid
        String y ="Kool-Aid";
        //string name and function temp
        String temp;
        //saves water in temp so water isn't lost when x is changed
        temp = x;
        //Overwrites x with the value of y
        x = y;
        //Assign the original value of x from temp to y
        y = temp;
        //outputs values of x and y
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

}
