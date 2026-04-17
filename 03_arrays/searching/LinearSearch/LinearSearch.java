/*
🧠 Logic:
Traverse array from left -> right
If element == key -> return index
Else return -1 */

public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};
        int key = 7;
        System.out.println(search(arr, key));
    }
}



/*
Complexity:
Time: O(n)
Space: O(1)
 */