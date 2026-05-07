public class ExcelSheetColumnNum {
    public static void main(String[] args) {
        String s = "AB";
        System.out.println(titleToNumber(s));
    }
    public static int titleToNumber(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
