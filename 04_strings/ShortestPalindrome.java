public class ShortestPalindrome {
    public static void main(String[] args) {
        String s = "aacecaaa";
        System.out.println(shortestPalindrome(s));
    }
    public static String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] lps = computeLPSArray(combined);
        return rev.substring(0, rev.length() - lps[combined.length() - 1]) + s;
    }

    private static int[] computeLPSArray(String str) {
        int[] lps = new int[str.length()];
        int length = 0;
        for (int i = 1; i < str.length(); ) {
            if (str.charAt(i) == str.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
