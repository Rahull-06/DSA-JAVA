public class MaxDifference {
    public int maxDifference(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0; // Not enough elements to calculate a difference
        }

        int minElement = nums[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minElement) {
                minElement = nums[i];
            } else {
                maxDiff = Math.max(maxDiff, nums[i] - minElement);
            }
        }

        return maxDiff > 0 ? maxDiff : 0; // Return 0 if no positive difference is found
    }
}