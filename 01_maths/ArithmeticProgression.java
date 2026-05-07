public class ArithmeticProgression {
    public static void main(String[] args) {
        int a = 2; // First term
        int d = 3; // Common difference
        int n = 5; // Number of terms

        System.out.println("Arithmetic Progression:");
        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }
    }
}
