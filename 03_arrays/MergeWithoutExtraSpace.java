/*
Gap Method (Shell Sort concept)

Technique:
-Compare elements at gap distance.
-Reduce gap gradually.

*/

public class MergeWithoutExtraSpace {
    static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int gap = (n + m + 1) / 2;

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < n + m) {
                int a = (i < n) ? arr1[i] : arr2[i - n];
                int b = (j < n) ? arr1[j] : arr2[j - n];

                if (a > b) {
                    if (i < n && j < n) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < n) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    } else {
                        int temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }
                i++; j++;
            }
            gap = (gap == 1) ? 0 : (gap + 1) / 2;
        }
    }
}


/*
Complexity:

Time: O((n+m) log(n+m)), Space: O(1)
*/