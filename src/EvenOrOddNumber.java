import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Welcome to the even or odd number program!");
        System.out.print("Enter an integer number: ");
        int number = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type an integer number: ");
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
