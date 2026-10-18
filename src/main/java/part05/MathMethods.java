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

// this is a publicly accessed class named Math Methods
public class MathMethods {
    // start of the program
    public static void main(String[] args) {
        //declaration of a double named x assigned to 3.14
        double x = 3.14;
        //declaration of a double named y assigned to -10
        double y = -10;
        // looks between both x and y and chooses the maximum value
        double z = Math.max(x, y);
        //prints out 3.14
        System.out.println(z);

        // re-assigns z to the minimum between 3.14 and -10 which is -10
        z = Math.min(x, y);
        // prints out -10.0
        System.out.println(z);

        // re-assigns z to the absolute value of y which is 10
        z = Math.abs(y);
        // prints z which is 10.0
        System.out.println(z);

        //uses a sqrt method from the predefined Math class
        z = Math.sqrt(y);
        // prints NaN - not a number
        System.out.println(z);

        // re-assigning 3.16 to y
        y = 3.16;
        // takes the square root of y (-10); negatives have no real square root, so z becomes NaN
        z = Math.sqrt(y);
        // prints 1.77
        System.out.println(z);

        // uses the round method from the math class on x which rounds 3.14 to 3.0
        z = Math.round(x);
        // prints 3.0
        System.out.println(z);
        // Math.ceil rounds x up to the next whole number, 4.0
        z = Math.ceil(x);
        // prints 4.0
        System.out.println(z);
        // Math.floor rounds x down to the previous whole number, 3.0
        z = Math.floor(x);
        // prints 3.0
        System.out.println(z);


    }

}
