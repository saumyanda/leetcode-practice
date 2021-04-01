class Solution {
    public boolean judgeCircle(String moves) {
        
      Map<Character,Integer> count=new HashMap<Character,Integer>();
        
        for(int i=0;i<moves.length();i++)
        {
            char move=moves.charAt(i);
            if(count.containsKey(move))
            {
                count.replace(move,count.get(move)+1);
            }
            else
            {
                count.put(move,1);
            }
        }
        
        int countLeft=0, countRight=0, countUp=0, countDown=0;
        
        if(count.containsKey('L'))
        {
          countLeft = count.get('L');
        }
        
        if(count.containsKey('R'))
        {
          countRight = count.get('R');  
        }
        
        if(count.containsKey('U'))
        {
          countUp = count.get('U');
        }
        
        if(count.containsKey('D'))
        {
        countDown = count.get('D');
        }
        
        if ((countUp==countDown) && (countLeft==countRight))
            return true;
        
        return false;  
    }
}
