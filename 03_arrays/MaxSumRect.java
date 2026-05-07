public class MaxSumRect {
    public int maxSumRect(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];

            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }

                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }

    private int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}