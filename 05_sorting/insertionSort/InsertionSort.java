/*
Intuition

-Insert element in correct position in sorted part
*/

public class InsertionSort{
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}


/*

or

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] arr = {5,4,3,1,2,6};
		
		for(int i=0;i<arr.length-1;i++){
		    for(int j=i+1;j>0;j--){
		        if(arr[j]<arr[j-1]){
		            int temp = arr[j];
		            arr[j] = arr [j-1];
		            arr[j-1] = temp;
		        }else{
		            break;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}

*/
/*
Complexity:
Best → O(n)
Worst → O(n²)
Space → O(1)
*/

