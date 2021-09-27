class Solution {
    //https://youtu.be/mwsjU6CHOb4
    public void wiggleSort(int[] nums) {
        
        //step 1: sort the array
        Arrays.sort(nums);
        
        //step 2: create extra space (new array) and maintain equality conditions
        //using 2 pointers i and j
        //initially j starts from the last element of the array and i starts from 1
        int n=nums.length;
        int[] temp=new int[n];
        int i=1,j=n-1;
        
        while(i<n)
        {
           temp[i]=nums[j];
           i+=2;
           j--;
        }
        
        //once i goes outside the length of the array start iteration 2
        //set i to 0
        i=0;
        while(i<n)
        {
           temp[i]=nums[j];
           i+=2;
           j--;
        }
        
        //step 3: copy back the new array to the original array
        for(int k=0;k<n;k++)
        {
            nums[k]=temp[k];
        }
    }
}
