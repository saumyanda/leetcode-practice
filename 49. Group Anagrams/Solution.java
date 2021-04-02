class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> groupedAnagrams=new ArrayList<>();
        
       Map<String,List<String>> groups=new HashMap<>();
        
       for(String current:strs)
       {
           char[] characters=current.toCharArray();
           Arrays.sort(characters);
           String sorted=new String(characters);
           
           if(!groups.containsKey(sorted))
           {
               groups.put(sorted,new ArrayList<>());
           }
           
           groups.get(sorted).add(current);
       }
        
        groupedAnagrams.addAll(groups.values());
        
        return groupedAnagrams;
    }
}
