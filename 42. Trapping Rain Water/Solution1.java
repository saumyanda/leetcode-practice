class Solution {
    public int trap(int[] height) {
         int n=height.length;

            int[] leftWalls=new int[n];
            int maxLeft=0;
            for(int i=0;i<n;i++)
            {
                leftWalls[i]=maxLeft;
                maxLeft=Math.max(height[i],maxLeft);
            }

            int[] rightWalls=new int[n];
            int maxRight=0;
            for(int j=n-1;j>=0;j--)
            {
                rightWalls[j]=maxRight;
                maxRight=Math.max(height[j],maxRight);
            }

            int totalWater=0;

            for(int k=0;k<n;k++)
            {
                int current=height[k];

                int min=Math.min(leftWalls[k],rightWalls[k]);

                if(min>current)
                {
                    totalWater+=min-current;
                }
            }  

            return totalWater;
    }
}
