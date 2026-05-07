public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] charCount = new int[128];
        for (char c : t.toCharArray()) {
            charCount[c]++;
        }

        int left = 0, right = 0, minLength = Integer.MAX_VALUE, startIndex = 0, count = t.length();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (charCount[rightChar] > 0) {
                count--;
            }
            charCount[rightChar]--;
            right++;

            while (count == 0) {
                if (right - left < minLength) {
                    minLength = right - left;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                charCount[leftChar]++;
                if (charCount[leftChar] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }
}