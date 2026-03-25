public class RomanToInteger {
    static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = getValue(s.charAt(i));

            if (prevValue < currentValue) {
                total += currentValue - 2 * prevValue; // subtract the previous value added and add the current value
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }
}
