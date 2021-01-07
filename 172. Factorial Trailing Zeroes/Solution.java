import java.math.*;
class Solution {
    
    public int trailingZeroes(int n) {
        
       int trailingZeroes = 0;  
        while(n >= 5) {
            n = n /5; 
            trailingZeroes += n;
        }
        return trailingZeroes;
    }
}
