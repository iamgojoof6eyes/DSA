import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b)); // (a, b) -> (b + a).compareTo(a + b) is a comparator that sorts the strings in descending order based on their concatenated values

        if (strNums[0].equals("0")) {
            return "0"; // If the largest number is 0, return "0" to avoid leading zeros
        }

        StringBuilder result = new StringBuilder();
        for (String strNum : strNums) {
            result.append(strNum);
        }
        return result.toString();
    }
}
