package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

import java.util.Scanner;
import java.util.Random;
//a public class Hypotenuse
public class Hypotenuse {
    //the start of a program
    public static void main(String[] args) {
        //Declares a double variable x
        double x;
        //Declares a double variable y
        double y;
        //declares a double variable z
        double z;
        //creates a scanner object so we can read numbers typed
        Scanner scanner = new Scanner(System.in);
        //Ask the suer to type the length of side x
        System.out.println("Enter side x: ");
        //reads a double from the svanner
        x = scanner.nextDouble();
        //prints enter the side y:
        System.out.println("Enter side y: ");
        //reads a doubke from the keyboard and stores it
        y = scanner.nextDouble();
        //Use the pythagoreom theroem
        z = Math.sqrt((x * x) + (y * y));
        //prints the hypotenuse
        System.out.println("The hypotenuse is: " + z);
        //closes the scanner of free resourcesz
        scanner.close();


    }
}
