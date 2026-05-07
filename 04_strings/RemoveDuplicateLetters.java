public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
    public static String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            count[c - 'a']--;

            if (visited[c - 'a']) continue;

            while (result.length() > 0 && c < result.charAt(result.length() - 1) && count[result.charAt(result.length() - 1) - 'a'] > 0) {
                visited[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }

            result.append(c);
            visited[c - 'a'] = true;
        }

        return result.toString();
    }
}
