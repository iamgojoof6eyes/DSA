import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int lcs = 1, ccs;

        for (int n : nums) {
            set.add(n);
        }

        for (int n : set) {
            int curr = n;
            if (set.contains(curr-1)) {
                continue;
            } else {
                ccs = 1;
                while (set.contains(curr+1)) {
                    ccs++;
                    curr++;
                }
                lcs = Math.max(lcs, ccs);
            }
        }
        return lcs;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(lcs.longestConsecutive(nums)); // Output: 4 (the longest consecutive sequence is [1, 2, 3, 4])
    }
}
