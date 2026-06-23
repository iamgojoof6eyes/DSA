//Have to find minimum element in rotated sorted array in logn time

public class MinRotatedSortedArray {
    public int search(int[] arr) {
        int l = 0, r = arr.length - 1, min = arr[0];

        while (l <= r) {
            if (arr[l] < arr[r]) {
                min = Math.min(min, arr[l]);
                break;
            } // list is already sorted and 0th element is smallest

            int mid = l + ((r - l)/2);
            if (arr[mid] < min) min = arr[mid];
            if (arr[l] >= arr[mid]) r = mid - 1; /*the left element is greater than middle value 
            that means the element left to the middle contains the the smallest element 
            because the element to the right is correctly sorted 
            and since element at left is bigger than element at right 
            that means the list is rotated 
            and since it is sorted 
            element should exist between l to mid in this case */
            else l = mid + 1; // same as previous but replace left with right and right with left
        }

        return min;
    }
}

/*
We use binary search because the array consists of two sorted portions created by rotation.

If the current range l...r is already sorted (arr[l] < arr[r]), then arr[l] is the minimum in that range and we can stop.

Otherwise, we check mid.

If arr[l] > arr[mid], the rotation point lies in the left half, meaning the minimum must be between l and mid. We update min with arr[mid] and continue searching left.

If arr[l] < arr[mid], the left half is properly sorted, so its smallest element is arr[l], which we've already considered. Therefore the minimum must lie in the right half, and we search there.

This reduces the search space by half each time, giving O(log n) time complexity and O(1) space complexity.
*/