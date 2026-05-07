import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(number));
        
        scanner.close();
    }
}
