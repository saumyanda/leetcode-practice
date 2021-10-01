class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> result=new LinkedList<>();
        int i=num.length-1;
        int curr=k;
        
        while(i>=0 || curr>0)
        {
          if(i>=0)
          {
              curr+=num[i];
          }
          result.add(curr%10);
          curr=curr/10;
          i--;
        }
        
        Collections.reverse(result);
        
        return result;
    }
}
