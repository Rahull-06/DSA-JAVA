public class SubarrayDivisibleByk {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int[] modCount = new int[k];
        modCount[0] = 1; // To account for subarrays that are directly divisible by k

        for (int num : nums) {
            sum += num;
            int mod = ((sum % k) + k) % k; // Handle negative sums
            count += modCount[mod];
            modCount[mod]++;
        }

        return count;
    }
}