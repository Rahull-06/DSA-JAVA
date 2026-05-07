public class CountNumOfString {
    public static void main(String[] args) {
        String s = "hello world";
        char target = 'o';
        System.out.println(countOccurrences(s, target));
    }
    public static int countOccurrences(String s, char target) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
