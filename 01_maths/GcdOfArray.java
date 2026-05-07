public class GcdOfArray {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int gcdOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) {
                return 1; // GCD is 1, no need to continue
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {48, 64, 16};
        System.out.println("GCD of array: " + gcdOfArray(arr));
    }
}
