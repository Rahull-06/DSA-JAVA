public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        int i=0; // Start with the first element as unique
        for (int  j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[j] = nums[i]; // Move unique element to the front
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4 };
        int newLength = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + newLength);
        System.out.print("Unique elements: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
