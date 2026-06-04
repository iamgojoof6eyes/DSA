//We are given a sorted array and have to remove duplicates from it

public class RemoveDuplicatesSorted {
    public int removeDUplicates(int[] nums) {
        int index = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
