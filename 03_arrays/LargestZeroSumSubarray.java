//Algorithm : HashMap (Prefix sum)

/*
Technique (Logic):
-Keep a running sum.
-If the same sum appears again → subarray in between = 0.
-Store first occurrence of each sum.
*/

import java.util.*;

public class LargestZeroSumSubarray {
    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) maxLen = i + 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -2, -3};
        System.out.println(maxLen(arr));
    }
}

/*
Complexity

Time: O(n), Space: O(n)
*/