// We have a list of positive numbers which are heights we have to return how many units of water we can store.

public class TrappingRainWater {
    public int trap(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int trapped = 0;

        int leftMax = heights[left];
        int rightMax = heights[right];

        while (left < right) {
            if (heights[left] < heights[right]) {
                leftMax = Math.max(leftMax, heights[left]);

                if (leftMax - heights[left] > 0) {
                    trapped += leftMax - heights[left];
                }
                left++;
            } else {
                rightMax = Math.max(rightMax, heights[right]);
                if (rightMax - heights[right] > 0) {
                    trapped += rightMax - heights[left];
                } 
                right--;
            }
        }

        return trapped;
    }
}
