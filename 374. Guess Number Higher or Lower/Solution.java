/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */
/*
We can apply Binary Search to find the given number. We start with the mid number. We pass that number to the guessguess function. If it returns a -1, it implies that the guessed number is larger than the required one. Thus, we use Binary Search for numbers lower than itself. Similarly, if it returns a 1, we use Binary Search for numbers higher than itself.
*/
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int low=1;
        int high=n;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int res=guess(mid);
            if(res==0)
                return mid;
            
            else if(res<0)
            {
                high=mid-1;
            }
            
            else
            {
                low=mid+1;
            }
        }
        
        return -1;
        
    }
}
