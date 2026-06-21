public class Search2DMatrix {
    public boolean search(int[][] matrix, int target) {
        int m = 0;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = right + ((left - right)/2);
            int midVal = matrix[mid / n][mid % n];

            if (midVal == target) return true;
            else if (midVal < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
