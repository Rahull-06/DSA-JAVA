import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        String[] nums = {"3", "30", "34", "5", "9"};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(String[] nums) {
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));
        if (nums[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }
        return sb.toString();
    }
}
