import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {
        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amt of seconds: ");
        //Reads int from user
        int seconds = scanner.nextInt();
        
        //Your code goes here
        //Convert secs into minutes
        int minutes = seconds / 60;
        
        //Convert minutes into hours
        int hours = minutes / 60;

        // closing the scanner object
        scanner.close();

        //Print out hrs && minutes passed
        //System.out.printf("%d hrs or %d minutes has passed\n", hours, minutes);
        System.out.print(hours + " " + minutes);
        
    }
}