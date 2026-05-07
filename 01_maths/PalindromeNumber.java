import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int n) {
        if (n < 0){
            return false;
        }
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }
}
