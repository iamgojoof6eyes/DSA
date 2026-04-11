import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        
        if (s == null || n == 0) {
            return ans;
        }

        Set<Character> set = new HashSet<>();
        int right, left = 0;
        for (right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }
        return ans;

    }
}
