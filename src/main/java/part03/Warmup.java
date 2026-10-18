package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        (this part's lesson starts here — GUIDE.md has it written out)

// Warm-up — 5 minutes, before the video. Practice, not graded.
//
// Open part02/Stretch.java. Look at your Stretch B1 (four variables, four lines)
// for 30 seconds. Then close it.
// Without looking again, make this file print the same four lines.
//
// You will need to type the main method yourself. That is the point.

import org.w3c.dom.ls.LSOutput;
// the public class for how all warmups will be created
public class Warmup {
    // the start of the program
    public static void main(String[] args) {
        // variables about me
        String name = "Juwan Johnson";
        int age = 20;
        double GPA = 3.31;
        Boolean Commuter = false;

        // printed version of my custom variables
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("GPA : " + GPA);
        System.out.println("Commuter : " + Commuter);
    }
}
