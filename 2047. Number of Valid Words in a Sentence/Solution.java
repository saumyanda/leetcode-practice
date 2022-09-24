class Solution {
    public int countValidWords(String sentence) {
        String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String r2 = "[^0-9]+";
        String[] words = sentence.split(" +");
        int count = 0;
        for(String s: words)
        {
            if(s.matches(regex) && s.matches(r2))
            {
                count++;
                System.out.println(s);
            }
        }
        return count;
    }
}
