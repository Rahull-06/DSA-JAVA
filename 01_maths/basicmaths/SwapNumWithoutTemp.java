public class SwapNumWithoutTemp {
    static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        swap(num1, num2);
    }
}
