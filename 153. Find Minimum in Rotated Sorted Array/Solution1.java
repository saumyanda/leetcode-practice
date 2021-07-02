class Solution {
    public static int findMinRotated(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            // if <= last element, then belongs to lower half
            if (arr[mid] <= arr[arr.length - 1]) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
