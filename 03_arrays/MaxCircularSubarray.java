public class MaxCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;
        int minSum = Integer.MAX_VALUE;
        int currentMin = 0;
        int totalSum = 0;

        for (int num : nums) {
            currentMax += num;
            maxSum = Math.max(maxSum, currentMax);
            if (currentMax < 0) {
                currentMax = 0;
            }

            currentMin += num;
            minSum = Math.min(minSum, currentMin);
            if (currentMin > 0) {
                currentMin = 0;
            }

            totalSum += num;
        }

        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}