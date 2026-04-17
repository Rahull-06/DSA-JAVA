public class BinaryNumTriangle {
    static void printBinaryNumTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 0) ? "0 " : "1 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printBinaryNumTriangle(n);
    }
}
