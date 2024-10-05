import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // instantiating a new object type Scanner

        System.out.println("Enter any number and this programme will tell you the " +
                "max and min. Enter any character to exit the programme.");

        double minNumber = 0;
        double maxNumber = 0;
        int loopCount = 0;
        do {
            System.out.println("Enter a number!! Or enter any character to exit.");
            String nextNumber = scanner.nextLine();
            try{ // testing the users code for an error to exit the loop
                double number = Double.parseDouble(nextNumber); // Parsing the users entered number
                if (minNumber == 0 || minNumber > number) {
                    minNumber = number;
                }
                if (maxNumber == 0 || maxNumber < number) {
                    maxNumber = number;
                }
                loopCount ++;

            } catch (NumberFormatException nfe){ // The error code is how the user exits the loop
                System.out.println("Exiting the programme.");
                break;
            }
        } while (true); // Infinite loop

        if(loopCount > 0) {
            System.out.println(loopCount + " number/s entered!");
            System.out.println("The largest number entered is: " + maxNumber);
            System.out.println("The smallest number entered is: " + minNumber);
        } else {
            System.out.println("No valid data has been entered.");
        }


    }
}
