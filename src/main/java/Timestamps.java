import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
  
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        
        //convert change in hrs to secs
        int hoursToSeconds = (hours2 - hours1) * 3600;
        //convert change in minutes to secs
        int minutesToSeconds = (minutes2 - minutes1) * 60;
        //calc change in secs
        int secondsToSeconds = (seconds2 - seconds1);

        //add all seconds together
        int totalSeconds = hoursToSeconds + minutesToSeconds + secondsToSeconds;
        
        // closing the scanner object
        scanner.close();
        
        //display seconds
        System.out.print(totalSeconds);
        
    }
}