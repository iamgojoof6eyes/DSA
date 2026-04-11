public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s2.length()-s1.length(); i++) {
            if (matches(s1Map, s2Map)) {
                return true;
            }
            s2Map[s2.charAt(i) - 'a']--; // Remove the leftmost character of the current window
            s2Map[s2.charAt(i + s1.length() - 1) - 'a']++; // Add the next character to the right of the current window
        }

        return matches(s1Map, s2Map);
    }

    public boolean matches(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PermutationInString solution = new PermutationInString();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = solution.checkInclusion(s1, s2);
        System.out.println(result); // Output: true
    }
}
