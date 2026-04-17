public class AlphaHill {
    static void printAlphaHill(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch + " ");
                if (k < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printAlphaHill(n);
    }
}
