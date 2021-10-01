//https://leetcode.com/problems/valid-mountain-array/discuss/194900/C%2B%2BJavaPython-Climb-Mountain
/*
Two people climb from left and from right separately.
If they are climbing the same mountain,
they will meet at the same point.
*/
class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i=0;
        
        int j=arr.length-1;
        
        while(i<arr.length-1 && arr[i]<arr[i+1])
        {
            i++;
        }
        
        while(j>0 && arr[j-1]>arr[j])
        {
            j--;
        }
        
        return j<arr.length-1 && i>0 && i==j;
    }
}
