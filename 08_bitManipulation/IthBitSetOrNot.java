public class IthBitSetOrNot {
    public static boolean isIthBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int i = 1; // Check if the 1st bit is set
        System.out.println(isIthBitSet(n, i)); // Output: false
    }
}

/*
complexity:

Time: O(1)
Space: O(1)
*/


//right shift operator (>>):

// public class IthBitSetOrNot {
//     public static boolean isIthBitSet(int n, int i) {
//         return ((n >> i) & 1 ) != 0;
//     }

//     public static void main(String[] args) {
//         int n = 5; // Binary: 101
//         int i = 1; // Check if the 1st bit is set
//         System.out.println(isIthBitSet(n, i)); // Output: false
//     }
// }