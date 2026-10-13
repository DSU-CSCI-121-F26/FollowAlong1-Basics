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
        /* MY GUESS:
        I think the code will print A, B , C and add a new line after that
        creates a tab for D and adds a \
        and adds quotation marks "" into E and just prints G
         */
        /* Wrong and why:
        AB added together
         */
        //prints A
        System.out.print("A");
        //prints B
        System.out.println("B");
        //Prints C with a new line
        System.out.print("C\n");
        //prints D with a tab and back slash
        System.out.println("\tD\\");
        //print "E" exactly like that
        System.out.println("\"E\"");
// System.out.println("F");
        //prints G
        System.out.print("G");
        //prints a new line
        System.out.println();
        //B1
        //prints Lu-kee Tucker
        System.out.println("Lu-kee Tucker");
        //prints Computer Science
        System.out.println("Computer Science");
        //prints Class of 2029
        System.out.println("Class of 2029");
        //B2
        //prints Lu-kee Tucker with a new line of Computer Science and a new line of Class of 2029
        System.out.println("Lu-kee Tucker \nComputer Science \nClass of 2029");
        //B3
        //prints the formula in the format by tabbing it and using the \\ command '
        System.out.println("Day \tClass\t\tTime");
        System.out.println("Mon \tCSCI-121\t2:00 PM");
        System.out.println("Tue \tCSCI-121\t3:00 PM");
        System.out.println("My teacher said \"type it yourself\"");
        System.out.println("My cose lives in C:\\Users\\lu-kee\\csc1121");

    }
}
