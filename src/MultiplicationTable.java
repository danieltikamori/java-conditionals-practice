import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner numberInput = new Scanner(System.in);
        System.out.println("Welcome to the multiplication table program!");
        System.out.print("Enter a number to be multiplied: ");
        double numberToBeMultiplied = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type the number to be multiplied: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberToBeMultiplied + " x " + i + " = " + numberToBeMultiplied * i);
        }
    }
}
