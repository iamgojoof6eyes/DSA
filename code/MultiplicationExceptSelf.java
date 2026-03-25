public class MultiplicationExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        MultiplicationExceptSelf multiplicationExceptSelf = new MultiplicationExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] ans = multiplicationExceptSelf.productExceptSelf(nums);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
