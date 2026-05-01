
public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int i = 0; // Clear the 0th bit
        System.out.println(clearIthBit(n, i)); // Output: 4 (Binary: 100)
    }
}

/*
complexity:

Time: O(1)
Space: O(1)
*/
