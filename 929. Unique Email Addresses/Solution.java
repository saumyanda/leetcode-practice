class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> emailSet=new HashSet<>();
        
        for(int i=0;i<emails.length;i++)
        {
            String email=emails[i];
            String[] arr=email.split("@");
            String localname=arr[0];
            String domainname=arr[1];
            
            String[] parts=localname.split("\\+");
        
            localname=parts[0].replace(".","");
            
            emailSet.add(localname+"@"+domainname);
        }
        
        System.out.println(emailSet);
        return emailSet.size();
        
    }
}
