import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int studentsAmtA = scanner.nextInt();
        int studentsAmtB = scanner.nextInt();
        int studentsAmtC = scanner.nextInt();

        /*
         *  your code goes here
         */
        int desksNeededA = (studentsAmtA / 2) + (studentsAmtA % 2);
        int desksNeededB = (studentsAmtB / 2) + (studentsAmtB % 2);
        int desksNeededC = (studentsAmtC / 2) + (studentsAmtC % 2);
        
        int desksNeeded = desksNeededA + desksNeededB + desksNeededC;
        System.out.print(desksNeeded);
        // closing the scanner object
        scanner.close();
    }
}