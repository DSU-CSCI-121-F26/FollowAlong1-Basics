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

public class MathMethods {
    public static void main(String[] args) {
        // declaring the variables x and y and assigning a value
        double x = 3.14;
        double y = -10;
        // finding the max between both values and outputting the largest value
        double z = Math.max(x, y);
        System.out.println(z);
        // finding the minimum between both values and outputting the smallest value
        z = Math.min(x, y);
        System.out.println(z);
        // outputting the absolute value so with that it's basically dropping the negative sign from the value and outputting the same number just positive
        z = Math.abs(y);
        System.out.println(z);
        // squaring the value and outputting the answer from that
        z = Math.sqrt(y);
        System.out.println(z);
        // changing the y values assigned value and making z = y squared and outputting the answer for that
        y = 3.16;
        z = Math.sqrt(y);
        System.out.println(z);
        // assigning z's value to be x rounded which means if its 5 or higher it goes up 1 numerical vale and drops the decimal and if its 4 or lower it just drops the decimals value
        z = Math.round(x);
        System.out.println(z);
        // ceil rounds the value x to the nearest  integer and outputs it as double
        z = Math.ceil(x);
        System.out.println(z);
        // round the number down to its like lowest possible value basically dropping its decimal and outputting the number
        z = Math.floor(x);
        System.out.println(z);
        
    }

}
