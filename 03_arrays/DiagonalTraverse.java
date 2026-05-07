public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int index = 0;

        for (int d = 0; d < m + n - 1; d++) {
            if (d % 2 == 0) {
                // Traverse upwards
                for (int i = Math.min(d, m - 1); i >= Math.max(0, d - n + 1); i--) {
                    result[index++] = matrix[i][d - i];
                }
            } else {
                // Traverse downwards
                for (int i = Math.max(0, d - n + 1); i <= Math.min(d, m - 1); i++) {
                    result[index++] = matrix[i][d - i];
                }
            }
        }

        return result;
    }
}