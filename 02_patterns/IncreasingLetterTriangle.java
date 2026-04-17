public class IncreasingLetterTriangle {
    static void printIncreasingLetterTriangle(int n) {
        char letter = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printIncreasingLetterTriangle(n);
    }
}
