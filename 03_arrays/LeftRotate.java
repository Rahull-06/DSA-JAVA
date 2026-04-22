public class LeftRotate {
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d >= n
        int[] temp = new int[d];

        // Store the first d elements in a temporary array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy the temporary array back to the end of the original array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotate(arr, d);
        printArray(arr); // Output: 3 4 5 1 2
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}