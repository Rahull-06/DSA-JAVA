public class SetIthBit {
    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int i = 1; // Set the 1st bit
        System.out.println(setIthBit(n, i)); // Output: 7 (Binary: 111)
    }
}

/*
complexity:

Time: O(1)
Space: O(1)

*/