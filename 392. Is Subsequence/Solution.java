class Solution {
    /*
    We designate two pointers for iteration, with the left pointer referring to the source string and the right pointer to the target string.
    
    We move the pointers accordingly on the following two cases:

If source[left] == target[right]: we found a match. Hence, we move both pointers one step forward.

If source[left] != target[right]: no match is found. We then move only the right pointer on the target string.

The iteration would terminate, when either of the pointers exceeds its boundary.

At the end of the iteration, the result solely depends on the fact that whether we have consumed all the characters in the source string. If so, we have found a suitable match for each character in the source string. Therefore, the source string is a subsequence of the target string.
*/
    
    public boolean isSubsequence(String s, String t) {
        
        int i=0;
        int j=0;
        
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        
        return i==s.length();
    }
}
