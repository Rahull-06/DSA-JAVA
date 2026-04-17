public class swapCount{
    public static int countSwaps(int[] arr){
        int n = arr.length;
        int swapCount = 0;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int swaps = countSwaps(arr);
        System.out.println("Number of swaps: " + swaps);
    }
}

/*
Complexity:
Time → O(n²)

*/