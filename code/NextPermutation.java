//We are given a list of integers by which we have to find next permutation of the number

/*
Next permutation: Suppose we have a number 134 the next permutaion here is 143. so next permutation means that the next biggest number we can form by arranging the numbers if no biggest number possible we return the loweset number possible
*/

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i>=0 && nums[i+1] <= nums[i]) {
            i--; //find the number which is smaller than the number right side to it
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--; //find the next larger number than the number at i
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i) {
        int j = nums.length;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
