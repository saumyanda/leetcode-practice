class Solution {
    public int binSearch(int[] arr, int low, int high)
    {
        int peak=low+(high-low)/2;
        
            if(arr[peak-1]<arr[peak] && arr[peak]>arr[peak+1])
            {
                return peak;
            }
            else if(arr[peak-1]<arr[peak] && arr[peak]<arr[peak+1])
            {
                return binSearch(arr,peak+1,high);
            }
            else if(arr[peak-1]>arr[peak] && arr[peak]>arr[peak+1])
            {
                return binSearch(arr,low,peak-1);
            }
            return -1;
    }
    public int peakIndexInMountainArray(int[] arr) {
        return binSearch(arr,1,arr.length-2);
    }
}
