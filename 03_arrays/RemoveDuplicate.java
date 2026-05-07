public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueCount = 1; // Start with the first element as unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i]; // Move the unique element to the front
                uniqueCount++;
            }
        }

        return uniqueCount; // Return the count of unique elements
    }
}