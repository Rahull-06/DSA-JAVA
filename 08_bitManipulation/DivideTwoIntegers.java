/*
-Handle overflow
-Convert numbers to positive
-Use left shift to find largest multiple
-Subtract it
-Add quotient
-Repeat
-Apply sign
*/

import java.util.Scanner;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert to long to avoid overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int result = 0;

        // Main division logic
        while (dvd >= dvs) {

            long temp = dvs;
            int multiple = 1;

            // Find largest shifted divisor
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract and add quotient
            dvd -= temp;
            result += multiple;
        }

        // Handle sign
        if ((dividend < 0) ^ (divisor < 0)) {
            return -result;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        int ans = divide(dividend, divisor);


        System.out.println("Quotient = " + ans);

        sc.close();
    }
}

/*
Complexity:

Time: O(log n) where n is the dividend
Space: O(1)
*/