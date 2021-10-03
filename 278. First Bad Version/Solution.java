/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low=1;
        int high=n;
        
        int result=0;
        
        while(low<=high)
        {
            int mid=low+(low-low)/2;
            
            if(isBadVersion(mid)==true && isBadVersion(mid+1)==true)
            {
               result=mid;
               high=mid-1;
            }
            
            if(isBadVersion(mid-1)==false && isBadVersion(mid)==false)
            {
                low=mid+1;
            }
        }
        
        return result;
    }
}
