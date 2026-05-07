public class ReverseWords {
    public static void main(String[] args) {
        String s = "Hello World from Java";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
