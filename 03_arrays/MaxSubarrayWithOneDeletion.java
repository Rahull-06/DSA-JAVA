public class MaxSubarrayWithOneDeletion {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] forward = new int[n];
        int[] backward = new int[n];

        forward[0] = arr[0];
        for (int i = 1; i < n; i++) {
            forward[i] = Math.max(arr[i], forward[i - 1] + arr[i]);
        }

        backward[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            backward[i] = Math.max(arr[i], backward[i + 1] + arr[i]);
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, forward[i]);
            if (i > 0) {
                maxSum = Math.max(maxSum, forward[i - 1]);
            }
            if (i < n - 1) {
                maxSum = Math.max(maxSum, backward[i + 1]);
            }
            if (i > 0 && i < n - 1) {
                maxSum = Math.max(maxSum, forward[i - 1] + backward[i + 1]);
            }
        }

        return maxSum;
    }
}