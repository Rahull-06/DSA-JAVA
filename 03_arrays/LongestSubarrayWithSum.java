import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(findLongestSubarray(arr, k));
    }
    public static int findLongestSubarray(int[] arr, int k) {
        Map<Integer, Integer> prefixSumIndexMap = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLength = i + 1;
            }

            if (!prefixSumIndexMap.containsKey(prefixSum)) {
                prefixSumIndexMap.put(prefixSum, i);
            }

            if (prefixSumIndexMap.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumIndexMap.get(prefixSum - k));
            }
        }

        return maxLength;
    }
}