public class SumFactors {
    static int sumFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 28;
        System.out.println("Sum of factors: " + sumFactors(number));
    }
}
