import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElemet(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Map.Entry<Integer, Integer> majorElement = null;

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (majorElement == null || i.getValue() > majorElement.getValue()) {
                majorElement = i;
            }
        }

        return majorElement.getKey();
    }
}