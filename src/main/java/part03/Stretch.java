package part03;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        rewatch 35:40–38:50 for swapping, 39:25–47:00 for Scanner
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// You will also need the Scanner import line, above the class.

public class Stretch {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

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

        /*
        my guess is that values a and b will be printed all as 2, then for the ints c
        and d they will output both 1 and 2 because temp will be initialized as c so it will hold the c
        value which is 1
         */

        System.out.println("What is your name?");
        String name = scnr.nextLine();
        System.out.println("Hi, " + name + "!");

        String first = "red";
        String second = "green";
        String third = "blue";
        System.out.println(first + " " + second + " " + third);

        String temp2 = first;
        first = second;
        second = third;
        third = temp2;
        System.out.println(first + " " + second + " " + third);

        System.out.println("How old are you?");
        int age = scnr.nextInt();

        // nextInt takes the number but leaves the Enter key sitting there.
        // Without this line the city question reads that leftover Enter and skips.
        // This line eats the Enter so the city question actually waits for me.
        scnr.nextLine();

        System.out.println("What city do you live in?");
        String city = scnr.nextLine();
        System.out.println(age + " years old, living in " + city);

    }

}
