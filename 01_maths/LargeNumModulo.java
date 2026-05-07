public class LargeNumModulo {
    public static int largeNumModulo(String num, int m) {
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            result = (result * 10 + (num.charAt(i) - '0')) % m;
        }
        return result;
    }

    public static void main(String[] args) {
        String num = "12345678901234567890";
        int m = 1000;
        System.out.println("Large number modulo: " + largeNumModulo(num, m));
    }
}
