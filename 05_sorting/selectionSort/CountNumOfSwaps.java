public class CountNumOfSwaps {
    static int selectionSort(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int swaps = selectionSort(arr);
        System.out.println("Number of swaps: " + swaps);
    }
}
