// there is a dictionary of words from an alien language, and we want to know if the given list of words is sorted lexicographically in this alien language. The order of the alphabet is given as a string order of length 26, where order[i] is the ith letter in the alien language. We can assume that all letters are lowercase and that all words are made up of lowercase letters. We can also assume that the order of the alphabet is valid and that it contains all 26 letters.

//Lexicographical: The order of the words is determined by the first different character in the two words. For example, if we have two words "hello" and "hella", the first different character is 'o' and 'a', and since 'o' comes after 'a' in the order of the alphabet, "hello" comes after "hella" in lexicographical order.

import java.util.HashMap;
import java.util.Map;

public class AlienDictionary {
    
    
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> charOrderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            charOrderMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return false;
            } else if (word1.equals(word2)) {
                continue;
            }

            for (int j = 0; j < word1.length(); j++) {
                // if (j > word2.length()) {
                //     return false;
                // }
                if (word1.charAt(j) != word2.charAt(j)) {
                    if (charOrderMap.get(word1.charAt(j)) > charOrderMap.get(word2.charAt(j))) {
                        return false;
                    }
                    break; // if the characters are different, we can break out of the loop as we have already determined the order of the words based on the first different character
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AlienDictionary alienDictionary = new AlienDictionary();
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean ans = alienDictionary.isAlienSorted(words, order);
        System.out.println(ans);
    }
}
