public class BasicCalculator {
    public static void main(String[] args) {
        String expression = "3+5*2-4";
        System.out.println(calculate(expression));
    }
    public static int calculate(String s) {
        int result = 0;
        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }
            if (!Character.isDigit(c) || i == s.length() - 1) {
                if (operation == '+') {
                    result += currentNumber;
                } else if (operation == '-') {
                    result -= currentNumber;
                } else if (operation == '*') {
                    result *= currentNumber;
                } else if (operation == '/') {
                    result /= currentNumber;
                }
                operation = c;
                currentNumber = 0;
            }
        }
        return result;
    }
}
