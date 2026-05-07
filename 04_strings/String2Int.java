public class String2Int {
    public static void main(String[] args) {
        String s = "12345";
        System.out.println(stringToInt(s));
    }
    public static int stringToInt(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result = result * 10 + (c - '0');
        }
        return result;
    }
}
