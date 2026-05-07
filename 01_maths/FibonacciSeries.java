import java.util.Scanner;

public class FibonacciSeries {
    static void printFibonacci(int n) {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to print: ");
        int terms = scanner.nextInt();
        
        printFibonacci(terms);
        scanner.close();
    }
}
