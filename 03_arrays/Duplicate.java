package patterns.hashing;
import java.util.*;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n))
                return true;
        }
        return false;
    }
}
