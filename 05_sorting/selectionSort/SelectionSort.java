/*
Intuition:
-Find the minimum element and place it at correct position”

Like:
Pick smallest -> put at index 0
Next smallest -> index 1
Continue...
*/


public class SelectionSort{
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

/*
Complexity:
Time → O(n²) (always)
Space → O(1)
*/


/*
“Small input?” → Insertion Sort
“Nearly sorted?” → Insertion Sort
“Memory constraint?” → Selection Sort
“Simple explanation?” → Bubble Sort
*/