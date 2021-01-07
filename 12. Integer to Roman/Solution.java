class Solution {
    public String intToRoman(int num) {
       
        //Map values to symbols
        Map<Integer, String> roman=new HashMap<Integer,String>();
        
        roman.put(1,"I");
        roman.put(5,"V");
        roman.put(10,"X");
        roman.put(50,"L");
        roman.put(100,"C");
        roman.put(500,"D");
        roman.put(1000,"M");
        
        String result="";
        
        //Find number of digits in number
        int numDigits=(int)Math.log(num)+1;
        
        
        for(int i=0;i<numDigits;i++)
        {
            //Find the place value
            int place=(int)Math.pow(10,numDigits-i-1);
            
            //Find number at that place
            int firstNum=num/place;
            
            if(firstNum==4)
            {
                result+=roman.get(place);
                result+=roman.get(place*5);
            }
            
            else if(firstNum==9)
            {
                result+=roman.get(place);
                result+=roman.get(place*10);
            }
            
            else
            {
               if(firstNum>4)
               {
                   result+=roman.get(place*5);
               }
                for(int j=0;j<firstNum%5;j++)
                {
                    result+=roman.get(place);
                }
            }
            
            num=num-(firstNum*place);
        }
        
        System.out.print(result);
        
        return result;
         
    }
}
