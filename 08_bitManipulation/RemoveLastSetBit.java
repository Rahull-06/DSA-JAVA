public class RemoveLastSetBit {
    public static int removeLastSetBit(int n) {
        return n & (n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 101
        System.out.println(removeLastSetBit(n)); // Output: 4 (Binary: 100)
    }
}

/*
complexity:

Time: O(1)
Space: O(1)
*/
