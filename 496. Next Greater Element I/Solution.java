import java.util.*;
class Solution {   
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        int[] loc=new int[10001];
        for(int i=0; i<nums2.length; i++){
            loc[nums2[i]]=i;
        }
        
        for(int i=0; i<nums1.length; i++){
            int ind=loc[nums1[i]];
            for(int j=ind+1; j<nums2.length; j++){
                if(nums2[j]>nums1[i]){
                    res[i]=nums2[j]; break;
                }
            }
            if(res[i]==0) res[i]=-1;
        }
        return res;
    }
}
