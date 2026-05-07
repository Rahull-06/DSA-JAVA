public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        String[] wordDict = {"leet", "code"};
        System.out.println(wordBreak(s, wordDict));
    }
    public static boolean wordBreak(String s, String[] wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Base case: empty string can be segmented

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && contains(wordDict, s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    private static boolean contains(String[] wordDict, String word) {
        for (String w : wordDict) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
