class Solution {
    /*
    Since the input array, nums, is sorted ascendingly and all the elements in it are within the given [lower, upper] bounds, we can simply check consecutive elements to see if they differ by one or not. If they don't, then we have found a missing range.

When nums[i] - nums[i-1] == 1, we know that there are no missing elements between nums[i-1] and nums[i].
When nums[i] - nums[i-1] > 1, we know that the range of elements, [nums[i-1] + 1, nums[i] - 1], is missing.

However, there are two edge cases:

Edge case 1: If we don't start with lower as the first element of the array, we will need to include [lower, num[0] - 1] as a missing range as well.

Edge case 2: Similarly, if we don't end with upper as the last element of the array, we will need to include [nums[n-1] + 1, upper] as a missing range as well. Note n here is the length of the input array, nums

    */
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        
        List<String> result=new LinkedList<>();
            
        int prev=lower-1;
        
        //go till the last element to take the missing ranges after last element in array
        for(int i=0;i<=nums.length;i++)
        {
            int curr=(i<nums.length) ? nums[i] : upper+1;
            
            if(prev+1<=curr-1)
            {
                result.add(formatString(nums,prev+1,curr-1));
            }
            prev=curr;
        }
        
        return result;
    }
    
     // formats range in the requested format
    private String formatString(int[] nums, int lower, int upper)
    {
        if(lower==upper)
        {
            return Integer.toString(lower);
        }
        return lower +"->"+upper;
    }
}
