public class PowerOf2 {
    public static boolean isPowerOf2(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16; // Binary: 10000
        System.out.println(isPowerOf2(n)); // Output: true (since 16 is a power of 2)
    }
}

/*
complexity:

Time: O(1)
Space: O(1)
*/
