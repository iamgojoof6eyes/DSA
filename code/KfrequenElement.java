import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class KfrequenElement {
    public int[] topKfrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a, b) -> count.get(a)-count.get(b) // this will create a min heap based on the frequency of the elements in the count map
        );

        for (int n : count. keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = k-1; i >= 0; i--) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
