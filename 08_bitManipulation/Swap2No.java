/*
XOR operator can be used to swap two numbers without using a temporary variable. The steps are as follows:

1. a = a ^ b; // Step 1: a holds the result of a ^ b
2. b = a ^ b; // Step 2: b holds the original value of a (since (a ^ b) ^ b = a)
3. a = a ^ b; // Step 3: a holds the original value of b (since (a ^ b) ^ a = b)

*/


public class Swap2No {
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a: " + a + ", b: " + b);
    }
}

/*complexity:

Time: O(1)
Space: O(1)

*/