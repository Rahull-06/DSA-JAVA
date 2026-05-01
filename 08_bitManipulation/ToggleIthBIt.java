public class ToggleIthBIt {
    public static int toggleIthBit(int n, int i) {
        int result = n ^ (1 << i);
        return result;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int i = 0; // Toggle the 0th bit
        System.out.println(toggleIthBit(n, i)); // Output: 4 (Binary: 100)
    }
}

/*
complexity:

Time: O(1)
Space: O(1)
*/
