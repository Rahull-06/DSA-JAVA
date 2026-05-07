public class HashingInStrings {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(hashString(s));
    }
    public static int hashString(String s) {
        int hash = 0;
        int prime = 31; // A prime number to reduce collisions

        for (char c : s.toCharArray()) {
            hash = hash * prime + (c - 'a' + 1); // Assuming input is lowercase letters
        }
        return hash;
    }
}
