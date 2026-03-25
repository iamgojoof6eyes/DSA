import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagram(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> ansMap = new HashMap<>();

        int[] count = new int[26];

        for (String str : strs) {
            Arrays.fill(count, 0); // reset the count array for each string to 0
            for (char c : str.toCharArray()) {
                count[c - 'a']++; // makes the count of each character appearing +1
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                sb.append('#'); // used as seprator to avoid the case where the count of a character is 0 and the next character has a count of 1
                sb.append(count[i]); //add after sperator
                // the result will look like #1#1#0#0...
            }

            String key = sb.toString();

            if (ansMap.containsKey(key)) {
                ansMap.get(key).add(str); // if the key already exists in the map, add the string to the list of that key
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                ansMap.put(key, list); //adds the key and the list to the map
            }
        }

        return new ArrayList(ansMap.values());
    }

    public static void main(String[] args) {
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagram.groupAnagram(strs);
        for (List<String> group : ans) {
            System.out.println(group);
        }
    }
}
