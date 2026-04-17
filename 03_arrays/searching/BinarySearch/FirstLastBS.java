/*
Logic:
Use binary search twice:
First occurrence → go left
Last occurrence → go right
*/

public class FirstLastBS {

    public static int first(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }

    public static int last(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }
}

/*
Count Occurrences (Binary)->

Logic:
count = lastIndex - firstIndex + 1
*/

/*
public static int count(int[] arr, int target) {
    int first = first(arr, target);
    int last = last(arr, target);

    if (first == -1) return 0;
    return last - first + 1;
}
*/