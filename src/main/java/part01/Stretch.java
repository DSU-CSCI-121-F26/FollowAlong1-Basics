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

        System.out.println("Jaidyn May");
        System.out.println("Computer Science");
        System.out.println("Class of 2029");

        System.out.print("Jaidyn May\n");
        System.out.print("Computer Science\n");
        System.out.print("Class of 2029\n");

        System.out.println("Day     Class           Time\n" +
                "Mon     CSCI-121        2:00 PM\n" +
                "Tue     CSCI-121        3:00 PM\n" +
                "My teacher said \"type it yourself.\"\n" +
                "My code lives in C:\\Users\\jordan\\csci121");

        /* MY GUESS:
          it will be ABC
                        DEG
      I was correct on AB and was wrong bout C thinking new line would be printed after
      I was correct on tab D but wrong about thinking the slash wouldn't print for being double
      I didn't know how to have quotes print around a string
      G I was flat out wrong about where its placement would be
        */
    }
}
