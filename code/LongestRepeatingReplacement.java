public class LongestRepeatingReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0;
        int left = 0;
        int right;
        int ans = 0;

        for (right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);

            if (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            } 
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}


/*
We haven't increased the maxCount even when the left pointer has moved and might have dropped the count of the most frequent character. This is because maxCount is only used to check if the current window is valid or not. Even if maxCount is not updated, the condition right - left + 1 - maxCount > k will still correctly determin if the windos is valid or not, the maxCount will only increase the window size when we encounter a new character that has a higher count than the current maxCount
*/