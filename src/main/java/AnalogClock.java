import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from users
        int hrAngle = scanner.nextInt();

        //calc hr (cut off decimal)
        int hr = (int) ((hrAngle / 360.0) * 12.0);

        //subtract hours by hr (cut of decimal) in order to get ratio for minutes, use ratio to get 1-12 (numbers on the clock)
        double minute = ((((hrAngle / 360.0) * 12.0) - hr) * 12);
        
        //convert clock number to angle 
        int minuteAngle = (int) Math.round((minute * 30.0));

        //print angle
        System.out.print(minuteAngle);

        // closing the scanner object
        scanner.close();
    }
}