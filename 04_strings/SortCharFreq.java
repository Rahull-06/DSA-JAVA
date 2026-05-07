public class SortCharFreq {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        int[] freq = new int[128]; // Assuming ASCII characters

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                result.append((char) i);
                freq[i]--;
            }
        }
        return result.reverse().toString(); // Reverse to get descending order
    }
}
