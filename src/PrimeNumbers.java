import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Welcome to the prime numbers program!");
        System.out.print("Enter an integer number: ");
        int number = NumberComparison.getValidNumber(numberInput, "Invalid input. Please try again, type an integer number: ");
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
