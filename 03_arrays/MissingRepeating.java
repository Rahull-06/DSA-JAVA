/*
Math (Sum + Square Sum)

Technique:

Use formulas:
-Sum difference
-Square difference
-Solve 2 equations
*/

public class MissingRepeating {
    static void find(int[] arr, int n) {
        long sumN = (long)n * (n + 1) / 2;
        long sumSqN = (long)n * (n + 1) * (2*n + 1) / 6;

        long sum = 0, sumSq = 0;

        for (int x : arr) {
            sum += x;
            sumSq += (long)x * x;
        }

        long diff = sum - sumN; // x - y
        long sqDiff = sumSq - sumSqN; // x^2 - y^2

        long sumXY = sqDiff / diff;

        long repeating = (diff + sumXY) / 2;
        long missing = sumXY - repeating;

        System.out.println("Repeating: " + repeating + " Missing: " + missing);
    }
}

/*
Complexity:

Time: O(n), Space: O(1)
*/