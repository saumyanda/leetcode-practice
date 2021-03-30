class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map=new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c))
            {
                map.replace(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        
        System.out.println(map);
        
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
            
            if(map.get(c)==1){
                return i;
            }
        }
        
        return -1;
    }
}
