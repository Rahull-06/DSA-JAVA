import java.util.Scanner;

public class SumOfNNumber {
    static int sumOfN(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Sum of first " + number + " natural numbers: " + sumOfN(number));
        
        scanner.close();
    }
}
