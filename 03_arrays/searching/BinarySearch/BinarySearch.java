/*
Logic
Array must be sorted
Compare mid with target
Reduce search space (half every time)
*/

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}

/*
Complexity
Time: O(log n)
Space: O(1)
*/