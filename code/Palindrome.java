public class Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        String lowered = s.toLowerCase();

        while (left < right) {
            char leftChar = lowered.charAt(left++);
            char rightChar = lowered.charAt(right--);
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        String testString = "XYX";
        boolean result = solution.isPalindrome(testString);
        System.out.println("Is the string \"" + testString + "\" a palindrome? " + result);
    }
}
