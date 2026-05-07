public class SquareRoot {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(findSqrt(n));
    }
    public static int findSqrt(int n) {
        if (n < 2) return n;

        int low = 1, high = n / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == n) return mid;
            else if (square < n) low = mid + 1;
            else high = mid - 1;
        }
        return high; // high will be the largest integer whose square is less than or equal to n
    }
}
