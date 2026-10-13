package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
//a class called MathMethods
public class MathMethods {
    //the that starts
    public static void main(String[] args) {
        // creates a double variable and store 3.14
        double x = 3.14;
        //creates a double variable and store -10
        double y = -10;
        //creates a double variable z
        double z = Math.max(x, y);
        //print the current value of z (3.14)
        System.out.println(z);
        //find the square root of -10
        z = Math.sqrt(y);
        //Prints NaN(Not a Number)
        System.out.println(z);
        //chnages y to 3.16
        y = 3.16;
        //finds the root of 3.16
        z = Math.sqrt(y);
        //prints teh square root of 3.16
        System.out.println(z);
        //round to the nearest whole number
        z = Math.round(x);
        //prinst 3
        System.out.println(z);
        //rounds up to 4
        z = Math.ceil(x);
        //prints 4
        System.out.println(z);
        //rounds down to 3
        z = Math.floor(x);
        //prints 3.0
        System.out.println(z);



    }

}
