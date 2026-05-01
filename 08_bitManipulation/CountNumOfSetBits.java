/*
Brian Kernighan’s Algorithm:
-Removes last set bit every time

*/
public class CountNumOfSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

}

/*
Complexity:

Time: O(k) → k = number of set bits
Space: O(1)
*/


/*
Using Bitwise (n & 1) — Better:

Logic:
(n & 1) → gives last bit directly
n >> 1 → shift right

public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        count += (n & 1);
        n = n >> 1;
    }
    return count;
}

Complexity:

Time: O(log n)
Space: O(1)

*/