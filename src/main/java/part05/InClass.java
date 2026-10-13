package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        rewatch 58:38–68:28 for the Math class and Random
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we type the rover trip report together, here.
        double distance = 5.0;                 // total distance
        double fartherLeg = 4.0;

        double batteryUsed = 12.8;

        int batteryRounded = (int) Math.round(batteryUsed);

        // Rounded UP battery (always rounds up)
        double batteryRoundedUp = Math.ceil(batteryUsed);

// Random rocks found, from 1 to 5
        int rocksFound = (int)(Math.random() * 5) + 1;

// Print results
        System.out.println("Distance: " + distance + " meters");
        System.out.println("Farther leg: " + fartherLeg);
        System.out.println("Battery used, rounded: " + batteryRounded + "%");
        System.out.println("Battery used, rounded up: " + batteryRoundedUp + "%");
        System.out.println("Rocks found: " + rocksFound);

        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        double root = Math.sqrt(16);
        double big = Math.max(3, 7);
        int whole = (int)Math.sqrt(25);

    }
}
