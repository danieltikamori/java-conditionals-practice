import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        System.out.println("Welcome to the number comparison program!");

        System.out.print("Enter the first number: ");
        int firstNumber = getValidNumber(numberInput, "Invalid input. Please try again, type the first number: ");

        System.out.print("Enter the second number: ");
        int secondNumber = getValidNumber(numberInput, "Invalid input. Please try again, type the second number: ");

        if (firstNumber > secondNumber) {
            System.out.println("The numbers are different. The first number " + firstNumber + " is greater than the second number " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("The numbers are different. The first number " + firstNumber + " is less than the second number " + secondNumber);
        } else {
            System.out.println(" The first number " + firstNumber + " is equal to " + "the second number " + secondNumber);
        }
    }

    static int getValidNumber(Scanner scanner, String errorMessage) {
        int number;
        while (true) {
            try {
//                System.out.print("Enter the number: ");
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print(errorMessage);
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }
}