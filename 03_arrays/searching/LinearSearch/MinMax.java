/*
Logic
Assume first element as min & max
Compare each element
*/

public class MinMax {
    public static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3};
        findMinMax(arr);
    }
}


/*
Complexity
Time: O(n)
Space: O(1)
*/