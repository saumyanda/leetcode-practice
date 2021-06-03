class Solution {
    public int trap(int[] height) {
       //to store maximum water
        int result=0;
        
        //for every element except first and last element
        for(int i=1;i<height.length-1;i++)
        {
            //find maximum element on its left
            int left=height[i];
            for(int j=0;j<i;j++)
            {
               left=Math.max(left,height[j]); 
            }
            
            //find maximum element on its right
            int right=height[i];
            for(int k=i+1;k<height.length;k++)
            {
               right=Math.max(right,height[k]);
            }
            
            //update maximum water value
            result += Math.min(left,right)-height[i];
        }
        return result;
    }
}
