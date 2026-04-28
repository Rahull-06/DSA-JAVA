/*
Merge Sort

Technique:
-Count pairs during merge step.
-Condition: arr[i] > 2 * arr[j]

*/

public class ReversePairs {
    static int count = 0;

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        countPairs(arr, l, mid, r);
        merge(arr, l, mid, r);
    }

    static void countPairs(int[] arr, int l, int mid, int r) {
        int j = mid + 1;

        for (int i = l; i <= mid; i++) {
            while (j <= r && arr[i] > 2L * arr[j]) j++;
            count += j - (mid + 1);
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, l, temp.length);
    }
}


/*
Complexity:

Time: O(n log n), Space: O(n)
*/