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
        int studentsAmtTotal = studentsAmtA + studentsAmtB + studentsAmtC;

        int desksNeeded = studentsAmtTotal / 2;

        if (desksNeeded % 2 == 1) { desksNeeded++; }

        System.out.print(desksNeeded);
        // closing the scanner object
        scanner.close();
    }
}