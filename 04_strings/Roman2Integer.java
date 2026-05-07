public class Roman2Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int currentValue = getValue(current);

            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);
                int nextValue = getValue(next);

                if (currentValue < nextValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
            } else {
                total += currentValue;
            }
        }
        return total;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // This should never happen for valid Roman numerals
        }
    }
}
