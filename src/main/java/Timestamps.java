import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.print("Hours 1: ");
        int hours1 = scanner.nextInt();
        
        System.out.print("Minutes 1: ");
        int minutes1 = scanner.nextInt();
        
        System.out.print("Seconds 1: ");
        int seconds1 = scanner.nextInt();
        
        System.out.print("Hours 2: ");
        int hours2 = scanner.nextInt();
        
        System.out.print("Minutes 2: ");
        int minutes2 = scanner.nextInt();
        
        System.out.print("Seconds 2: ");
        int seconds2 = scanner.nextInt();
        
        //convert change in hrs to secs
        int hoursToSeconds = (hours2 - hours1) * 3600;
        //convert change in minutes to secs
        int minutesToSeconds = (minutes2 - minutes1) * 60;
        //calc change in secs
        int secondsToSeconds = (seconds2 - seconds1);

        //add all seconds together
        int totalSeconds = hoursToSeconds + minutesToSeconds + secondsToSeconds;

        //display seconds
        System.out.println(totalSeconds);
        // closing the scanner object
        scanner.close();
    }
}