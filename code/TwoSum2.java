// Two Sum II - Input Array Is Sorted: we are given a sorted array of integers and a target value. We need to find the indices of the two numbers in the array that add up to the target value. The array is 1-indexed, meaning that the first element has an index of 1.

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // Move the left pointer to the right to increase the sum
            } else {
                right--; // Move the right pointer to the left to decrease the sum
            }
        }
        return null;
    }
}
