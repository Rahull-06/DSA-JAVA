import java.util.*;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // To handle the case when the subarray starts from index 0

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;

            if (map.containsKey(mod)) {
                if (i - map.get(mod) > 1) { // Check if the subarray has at least two elements
                    return true;
                }
            } else {
                map.put(mod, i);
            }
        }

        return false;
    }
}