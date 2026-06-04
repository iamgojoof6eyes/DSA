import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// i+j+k = 0

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; nums[i] <= 0 && i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        System.out.println(result);
    }
}

/*
We can also use hashset to solve this problem, all the logic will be same, but we will store the values of second iteration in a hashset (during first iteration of 2nd) and check if the k = -1*(i+j) exists in the hashset, if it does then we have found a triplet. 
*/