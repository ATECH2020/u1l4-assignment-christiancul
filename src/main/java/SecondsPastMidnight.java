import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {
        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amt of seconds: ");
        //Reads int from user
        int seconds = scanner.nextInt();
        
        //Your code goes here
        int hours, minutes;
        hours = minutes = 0;

        //Convert secs into minutes
        minutes = seconds / 60;
        
        //Convert minutes into hours
        hours = minutes / 60;

        //Print out hrs && minutes passed
        //System.out.printf("%d hrs or %d minutes has passed\n", hours, minutes);
        System.out.println(hours + " " + minutes);
        // closing the scanner object
        scanner.close();
    }
}