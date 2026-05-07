import java.util.HashSet;

public class CountDistinctEle {
    public static int countDistinct(int[] arr) {
        HashSet<Integer> distinctElements = new HashSet<>();
        for (int num : arr) {
            distinctElements.add(num);
        }
        return distinctElements.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 5};
        int distinctCount = countDistinct(arr);
        System.out.println("Number of distinct elements: " + distinctCount);
    }
}