public class FindNumOfComparisons {
    static int selectionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return comparisons;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int numOfComparisons = selectionSort(arr);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumber of comparisons: " + numOfComparisons);
    }
}
