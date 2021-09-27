class Solution {
    public boolean isStrobogrammatic(String num) {
       /*
       We initialize two pointers; left and right. We then iterate both pointers towards the middle at each step, ensuring that the digits at left and right correspond to one of the five valid pairs. An elegant way of doing this is to define a hash map of valid left -> right mappings.
       
       If no invalid pairs are found, then the number must be strobogrammatic. Note that the middle-digit-of-an-odd-number case is handled correctly; the final iteration will have left = right. If they are both pointing to the same 0, 1, or 8, then the condition will be false, and true returned at the end. If they are both pointing at a 6, then the condition will be true, and false will be returned, as expected_rotation will be 9, and num[right] will be 6.
       
       */
        Map<Character,Character> mappings=Map.of('0','0','1','1','6','9','8','8','9','6');
        
        int low=0;
        int high=num.length()-1;
        
        while(low<=high)
        {
            char c=num.charAt(high);
            if(!mappings.containsKey(c) || mappings.get(c)!=num.charAt(low))
            {
                return false;
            }
            low++;
            high--;
        }
        
        return true;
    }
}
