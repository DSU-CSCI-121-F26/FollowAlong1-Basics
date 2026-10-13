package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        rewatch 35:40–38:50 for swapping, 39:25–47:00 for Scanner
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// You will also need the Scanner import line, above the class.

import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
        I think it will print 22
        I rhink it will print 21
         */
        int a = 1;
        int b = 2;
        a = b;
        b = a;
        System.out.println(a + " " + b);
        int c = 1;
        int d = 2;
        int temp = c;
        c = d;
        d = temp;
        System.out.println(c + " " + d);
        Scanner scanner = new Scanner(System.in);

        //trap version
        System.out.println("How old are you");
        int age = scanner.nextInt();   // leaves a newline

        System.out.println("What city do you live in?");
        String cityTrap = scanner.nextLine();   // gets skipped!

        System.out.println("TRAP: " + age + " years old, living in " + cityTrap);

        //Fix version
        // The fix: nextInt() leaves a leftover newline, so we read and throw it away


        System.out.println("How old are you");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What city you live in");
        String city = scanner.nextLine();

        System.out.println(age + " years old, living in "+city);


//        System.out.println("What is your name?");
//
//        String name = scanner.nextLine();
//
//        System.out.println("Hi,"+name);

        String first = "red";
        String second = "green";
        String third = "blue";

        System.out.println(first + ", " + second + ", " + third);
        String temp1 = first;  // save red
        first = second;       // first becomes green
        second = third;       // second becomes blue
        third = temp1;         // third becomes red
        System.out.println(first + ", " + second + ", " + third);

    }



}
