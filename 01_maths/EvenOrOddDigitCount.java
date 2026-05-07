public class EvenOrOddDigitCount {
    public static String evenOrOddDigitCount(int n) {
        int evenCount = 0;
        int oddCount = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            n /= 10;
        }

        return evenCount > oddCount ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println(evenOrOddDigitCount(number));
    }
}
