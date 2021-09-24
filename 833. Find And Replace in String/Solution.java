class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        //Step 1 : create an index map of indices
        //sort the indices array from left to right
        HashMap<Integer,Integer> indexMap=new HashMap<>();
        for(int i=0;i<indices.length;i++)
        {
            indexMap.put(indices[i],i);
        }
        Arrays.sort(indices);
        
    //Step 2: For each index in indices array 
    //check for validity - s doesn't have substring starting at that index equal to sources[i]
    //append last processed string till the current index
    //append targets string
        int curr=0;
        StringBuilder sb=new StringBuilder();
        for(int index:indices)  
        {
            int i=indexMap.get(index);
            
            int next=index+sources[i].length();
            
            if(!s.substring(index,next).equals(sources[i]))
                continue;
            
            sb.append(s.substring(curr,index));
            sb.append(targets[i]);
            curr=next;
        }
        
        //Step 3: append remaining string
        sb.append(s.substring(curr));
        return sb.toString();
    }
}
