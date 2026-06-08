public class PalandromicSubstring {
    public int countSubstring(String s) {
        int ans = 0;

        for (int i = 0; i <= s.length()-1; i++) {
            ans += checkPalindrome(s, i, i); //for odd length palindrome
            ans += checkPalindrome(s, i, i+1); // for even length palindrome
        }
        return ans;
    }

    public int checkPalindrome(String s, int left, int right) {
        // here for even case s.charAt(left) != s.charAt(right) so it will break out after first iteration making count = 1

        // but for even case i (left) = i+1 (right) then it will keep going
        int count = 0;
        while (left >= 0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}

/*
Working
Our approch here is to take element check
the left and right of it if left and right is equal
then increase the count of palindrome if it is not move on
Base case check to continue loop,
left == right;
For odd palindrome;
left == right then keep on moving
For even palindrome;
left != right but current == right
then keep on moving

if the case not satisfies move to next character

A character is palindrome to itself always
*/
