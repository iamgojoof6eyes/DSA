import java.util.HashSet;
// have to check if there are any duplicate elements in the array within a distance of k
class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (i >= k) {
                set.remove(nums[i - k]); // remove the element that is k distance away from the current element to maintain the window of size k
            }
        }
        return false;
    }
}