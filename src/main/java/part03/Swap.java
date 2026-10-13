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
//a class called Swap
public class Swap {
    //the psvm that runs the code
    public static void main(String[] args) {
        //String variable with x that hols water
        String x = "water";
        //String variable y that holds Kool-Aid
        String y = "Kool-Aid";
        //variable x is equal to y
        x=y;
        //variable y is equal to x
        y=x;
//prints x: with the variable from x
        System.out.println("x: "+ x);
        //Prints y: with the variable from y
        System.out.println("y: "+y);

    }

}
