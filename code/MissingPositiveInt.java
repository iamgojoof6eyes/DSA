public class MissingPositiveInt {
    public int firstMissingPositive(int[] nums) {
        int contains = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                contains++;
                break;
            }
        }

        if (contains == 0) {
            return 1; // 1 is not present in the array, so return 1 as the smallest missing positive integer
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1; // Replace out-of-range values with 1
            }
        }

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]);
        
            if (index == n) {
                nums[0] = -Math.abs(nums[0]); // Mark presence of n by negating the value at index 0
            } else {
                nums[index] = -Math.abs(nums[index]); // Mark presence of index by negating the value at that index
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                return i; // The first positive index indicates the smallest missing positive integer
            }
        }

        if (nums[0] > 0) {
            return n; // If index 0 is positive, it means n is missing
        }

        return n + 1; // If all integers from 1 to n are present, return n + 1
    }

    public static void main(String[] args) {
        MissingPositiveInt solution = new MissingPositiveInt();
        int[] nums = {-23, 2, 1, 3, 100, 7};
        int missing = solution.firstMissingPositive(nums);
        System.out.println("The smallest missing positive integer is: " + missing);
    }
}
