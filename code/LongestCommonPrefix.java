public class LongestCommonPrefix {
    public String commonPrefix(String[] strings) {
        String prefix = strings[0]; //Suppose that the first string is longest common prefix

        for (String string : strings) {
            //check where the "prefix" exists in the current string if it is on start it will return 0
            while (string.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                //remove the character at last index as it doesn't match the prefix of current string
                //keep doing it until we reach a prefix which is same

                if (prefix.isEmpty()) return ""; //check if the prefix is existent or not
            }
        }
        return prefix;
    }
}
