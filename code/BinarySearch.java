public class BinarySearch {
    public int search(int[] arr, int x) {
        int l = 0;
        int r = arr.length;

        while (l <= r) {
            int m = l + (r - l)/2;
            if (arr[m] == x) return m;
            else if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

}
