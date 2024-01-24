import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Welcome to the factorial calculator program!");
        System.out.print("Enter an integer number: ");
        int number = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type an integer number: ");
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);
    }
}
