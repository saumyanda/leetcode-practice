class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        LinkedList<Integer> mergedList=new LinkedList<Integer>();
        
        double result=0;
        
        for(int i=0;i<nums1.length;i++)
        {
            mergedList.add(nums1[i]);
        }
        
        for(int j=0;j<nums2.length;j++)
        {
            mergedList.add(nums2[j]);
        }
        
        Collections.sort(mergedList);
        
        int size=mergedList.size();
        
        if(size%2==0)
        {
           result=(mergedList.get((size/2)-1)*1.0+mergedList.get(size/2)*1.0)/2; 
        }
        else
        {
            result=mergedList.get(size/2);
        }
        
        return result;
    }
}
