package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we make the rover's variables together, here, and print them.
        String rover = "Sting";
        int battery = 87;
        double speed = 1.5;
        char mode = 'C';
        boolean lightsOn = true;

        System.out.println("Rover " + rover + " has " + battery + "% battery.");
        System.out.println("Speed: " + speed + " m/s, mode " + mode + " lights on: " + lightsOn);
        System.out.println("After driving, battery is " + (battery - 12) + "%.");

        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        double fuel = 87.5;
        char grade = 'C';
        System.out.println(battery);
        /*

        */
    }
}
