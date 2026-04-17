/*
Logic
Compare adjacent elements
If any arr[i] > arr[i+1] → not sorted
*/

public class CheckSorted {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(isSorted(arr));
    }
}

/*
Complexity
Time: O(n)
Space: O(1)
*/