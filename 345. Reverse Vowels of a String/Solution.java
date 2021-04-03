class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> vowels=new HashSet<>();
        
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');
        
        int i=0;
        int j=s.length()-1;
        char[] chars=s.toCharArray();
        while(i<j)
        {
            while(i<j && !vowels.contains(chars[i]))
            {
                i++;
            }
            while(i<j && !vowels.contains(chars[j]))
            {
                j--;
            }
            char temp=chars[i];
            chars[i++]=chars[j];
            chars[j--]=temp;
        }
        
        return new String(chars);
    }
}
