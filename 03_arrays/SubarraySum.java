public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        System.out.println(findSubarraySum(arr, target));
    }
    public static boolean findSubarraySum(int[] arr, int target) {
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                return true; // Subarray found
            }
        }
        return false; // No subarray found
    }
}