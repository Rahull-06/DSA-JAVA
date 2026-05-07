public class ThreeSum {
    static void findThreeSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, -1};
        int target = 0;
        findThreeSum(arr, target);
    }
}