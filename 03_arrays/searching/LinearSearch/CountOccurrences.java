/*
Logic:
Initialize count = 0
Traverse array
If element == key → increment count
*/

public class CountOccurrences {
    public static int count(int[] arr, int key) {
        int count = 0;
        for (int num : arr) {
            if (num == key) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        System.out.println(count(arr, 2));
    }
}



/*
Complexity
Time: O(n)
Space: O(1)
*/