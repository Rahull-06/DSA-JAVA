import java.util.Scanner;

public class ReverseANumber {
    static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Reversed number: " + reverse(number));
        scanner.close();
    }
}
