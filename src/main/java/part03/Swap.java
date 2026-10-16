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
    public static void main(String [] args) {

        // Make a String variable called x and store the word water in it. This is the first cup.
        String x = "water";
        // Make a String variable called y and store the word Kool-Aid in it. This is the second cup.
        String y = "Kool-Aid";
        // Make an empty String variable called temp. This is the third cup. It has no value yet because it is only here to hold something for a moment.
        String temp;
        // Copy what is in x (water) into temp. Now the water is safe because x is about to get overwritten.
        temp = x;
        // Copy what is in y (Kool-Aid) into x. The old value of x is gone but we already saved it in temp.
        x = y;
        // Copy what is in temp (water) into y. This finishes the swap because y now holds the water..
        y = temp;

        // Print x with a label in front so the output is easy to read. It should show Kool-Aid.
        System.out.println("x: " + x);
        // Print y with a label in front. It should show water.
        System.out.println("y: " + y);
    }

}
