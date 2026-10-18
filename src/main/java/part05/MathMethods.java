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
    public static void main(String[] args){
        double x = 3.14; //declares decimal value 3.14 to x
        double y = -10; // declares int 10 to y
        double z = Math.max(x, y); // compares x and y and assigns larger value out of x and y to z
        System.out.println(z);// prints out x for x is the greater value between 3.14 and -10

        z = Math.min(x, y);// assigns the smallest value of x and y  to z
        System.out.println(z); // prints -10 for -10 was assigned to z

        z = Math.abs(y); // calculates the absolute value of y shifting (-10 to 10) and assigns it to y
        System.out.println(z); // outprints the absolute value of z which is -10 assigned from y

        z = Math.sqrt(y); // tries getting the square root of a number and assigns to y( a negative number returns NaN)
        System.out.println(z); // prints NaN for square root of a negative number is undefined

        y = 3.16; // y has been reassigned decimal value of 3.16
        z = Math.sqrt(y); //tries getting the square root of a number and assigned to y
        System.out.println(z); //prints the square root of 3.16 stored in z

        z = Math.round(x); // rounds the double of x to its nearest integer and assigns to z
        System.out.println(z); // prints the rounded integer value from x stored in z
        z = Math.ceil(x); // rounds x to its next highest integer and assigns to z
        System.out.println(z); // the ceiling(next highest integer) value stored in x
        z = Math.floor(x); //rounds x to its next lowest integer and assigns to z
        System.out.println(z);// prints the floor(next lowest integer) value stored in x

    }

}
