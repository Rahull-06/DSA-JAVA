import java.util.Scanner;

public class CountDigits {
    static int countDigits(int n) {
        if (n == 0) return 1;

        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Number of digits: " + countDigits(number));
        scanner.close();
    }
}
