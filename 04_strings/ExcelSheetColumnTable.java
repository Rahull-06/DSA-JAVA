public class ExcelSheetColumnTable {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(numberToTitle(n));
    }
    public static String numberToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; // Decrement n to make it 0-indexed
            char c = (char) ('A' + (n % 26));
            sb.append(c);
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
