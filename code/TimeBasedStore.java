import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedStore {
    Map<Integer, TreeMap<Integer, String>> map;

    public TimeBasedStore() {
        map = new HashMap<>();
    }

    public void set(int key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(int key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        TreeMap<Integer, String> treeMap = map.get(key);
        // Map.Entry<Integer, String> entry = treeMap.floorEntry(timestamp);
        // return entry != null ? entry.getValue() : "";

        Integer floorKey = treeMap.floorKey(timestamp);
        return floorKey != null ? treeMap.get(floorKey) : "";
    }
}
