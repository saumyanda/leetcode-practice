class Solution {
    /*
//https://youtu.be/io3N5YTFbxM
i is the position in the original array,
j is the position in the new array.
(the original and the new are actually the same array.)

The first we pass forward and count the zeros.
The second we pass backward and assign the value from original input to the new array.
so that the original value won't be overridden too early.

    */
    public void duplicateZeros(int[] arr) {
        //two pointer method
        int countZeroes=0;
        
        //count zeroes in the array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                countZeroes++;
            }
        }
        
        //length of larger array after duplicating zeroes
        int len=arr.length+countZeroes;
        
        //i points to the position in the array and j points to new position
        for(int i=arr.length-1,j=len-1; i<j; i--,j--)
        {
           if(arr[i]!=0)
           {
               if(j<arr.length)
               {
                   arr[j]=arr[i];
               }
           }
            else //if number is zero copy twice
            {
                if(j<arr.length)
                {
                    arr[j]=arr[i];
                }
                j--;
                if(j<arr.length)
                {
                    arr[j]=arr[i]; //copy twice
                }
            }
        }
    }
}
