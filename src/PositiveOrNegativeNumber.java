import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        while (scanner.hasNext()) {
            try {
                int userInputNumber = scanner.nextInt();
                if (userInputNumber >= 0) {
                    System.out.println("The number is positive");
                    break;
                } else {
                    System.out.println("The number is negative");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again:");
            } finally {
                scanner.nextLine();
            }
        }
    }
}