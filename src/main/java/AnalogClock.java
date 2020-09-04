import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from users
        int hrAngle = scanner.nextInt();

        //calc hr (rounded)
        int hr = (int) ((hrAngle / 360.0) * 12.0);

        //subtract hours by hr (rounded) in order to get ratio for minutes, convert ratio into 1-12 on the clock
        int minute = (int) ((((hrAngle / 360.0) * 12.0) - hr) * 12);
        //convert clock num to angle
        int minuteAngle = minute * 30;

        //print angle
        System.out.println(minuteAngle);
        /*
         *  your code goes here
         */

        // closing the scanner object
        scanner.close();
    }
}