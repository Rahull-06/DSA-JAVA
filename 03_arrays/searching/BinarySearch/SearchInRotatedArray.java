public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            } else { // Right half is sorted
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1; // Search in the right half
                } else {
                    high = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Target not found
    }
}
