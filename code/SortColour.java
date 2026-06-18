public class SortColour {
    public void sortColor (int[] arr) {
        int low = 0, high = arr.length - 1, current = 0;

        while (current <= high) {
            if (arr[current] == 0) {
                swap(arr, current, low);
                low++;
                current++;
            } else if (arr[current] == 2) {
                swap(arr, current, high);
                high--;
            } else {
                current++;
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
