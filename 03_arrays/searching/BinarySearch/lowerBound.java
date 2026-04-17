/*
Logic
Store possible answer
Move left to find first occurrence
*/

public class lowerBound {
    public static int findLowerBound(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                ans = mid;
                high = mid - 1; // Move left
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        System.out.println(findLowerBound(arr, 2)); // Output: 1
    }
}


//Upper Bound:

/*
public static int upperBound(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    int ans = arr.length;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] > target) {
            ans = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return ans;
}
*/