import java.util.Scanner;

public class ProductOfNumber {
    static int productOfDigits(int n) {
        int product = 1;

        while (n != 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Product of digits: " + productOfDigits(number));
        scanner.close();
    }
}
