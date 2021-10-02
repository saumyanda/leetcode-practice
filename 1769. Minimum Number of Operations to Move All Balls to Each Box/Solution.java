class Solution {
    //https://youtu.be/TjedLBZbqmM
    public int[] minOperations(String boxes) {
        
        int n=boxes.length();
        
        int[] result=new int[n];
        
        int ahead=0; //number of balls ahead of a position
        int behind=0; //number of balls behind a position
        
        for(int i=0;i<n;i++)
        {
            if(boxes.charAt(i)=='1')
            {
                ahead++;
        //add the number of moves it will take to bring all balls in array to position 0
                result[0]+=i; 
            }
        }
        
        //if at index 0 there are balls present
        //then the number of balls ahead of that position would decrement
        //and the number of balls behind that position would increment
        if(boxes.charAt(0)=='1')
        {
            ahead--;
            behind++;
        }
        
        //at any position get the number of moves required from last step
        //subtract the number of balls ahead bcoz we need lesser moves
        //add the number of balls behind that position
        for(int i=1;i<n;i++)
        {
            result[i]+=result[i-1]-ahead+behind;
            if(boxes.charAt(i)=='1')
            {
               ahead--;
               behind++;
            }
        }

        return result;
    }
}
