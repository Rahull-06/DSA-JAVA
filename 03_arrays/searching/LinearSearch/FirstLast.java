/*Logic:
Traverse array
First occurrence → first match
Last occurrence → keep updating
*/

public class FirstLast {
    public static void findPositions(int[] arr, int key) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (first == -1) first = i;
                last = i;
            }
        }

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 2};
        findPositions(arr, 2);
    }
}


/*
Complexity
Time: O(n)
Space: O(1)
*/