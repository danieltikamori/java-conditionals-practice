
import java.util.Scanner;

public class GeometricAreaCalculator {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        System.out.println("Welcome to the geometric area calculator program!");

        System.out.println("Choose one of the following shapes:");
        System.out.println("1. Circle");
        System.out.println("2. Square");

        System.out.print("Enter your choice: ");
        int choice = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type your choice: ");

        switch (choice) {
            case 1:
                calculateCircleArea(numberInput);
                break;
            case 2:
                calculateSquareArea(numberInput);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        numberInput.close();
    }

    private static void calculateCircleArea(Scanner numberInput) {
        System.out.print("Enter the radius: ");
        double radius = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type the radius: ");

        System.out.println("The area of the circle is " + Math.PI * radius * radius);
    }

    private static void calculateSquareArea(Scanner numberInput) {
        System.out.print("Enter the first side: ");
        double firstSide = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type the first side: ");
        System.out.print("Enter the second side: ");
        double secondSide = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type the second side: ");

        System.out.println("The area of the square is " + firstSide * secondSide);
    }
}
