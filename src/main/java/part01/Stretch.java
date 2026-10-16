package part01;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=750s
//        rewatch 12:30–17:30 if you forget how print, \n, \t, \" or \\ work
// Guide: GUIDE.md in this folder, steps 3–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {

        System.out.print("A");
        System.out.println("B");
        System.out.print("C\n");
        System.out.println("\tD\\");
        System.out.println("\"E\"");
        // System.out.println("F");
        System.out.print("G");
        System.out.println();

        /*
        all the outputs will be,
        A
        B
        C
            D\
        \E\
        G

        and thats what will all output
         */
        // i didnt read the first print not having ln at the end. and i lowkey thought it was gonna be slashes.

        System.out.println("Skye Pepp");
        System.out.println("Computer Science");
        System.out.println("Class of 2028");

        System.out.print("Skye Pepp\n" + "Computer Science\n" + "Class of 2028");

        System.out.println("Day" + "\tClass" + "\tTime");
        System.out.println("Mon" + "\tCSCI-121" + "\t2:00PM");
        System.out.println("Tue" + "\tCSCI-121" + "\t3:00PM");
        System.out.println("My teacher said \"type it yourself.\"");
        System.out.println("My code lives in C:\\Users\\jordan\\csci121");
    }

}
