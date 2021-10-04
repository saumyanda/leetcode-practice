//https://youtu.be/AXjmTQ8LEoI
class TrieNode
{
    Map<Character,TrieNode> children;
    boolean endOfWord;
    
    public TrieNode()
    {
        children=new HashMap<>();
        endOfWord=false;
    }
}

class Trie {

    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current=root;
        for(char c:word.toCharArray())
        {
            TrieNode node=current.children.get(c);
            
            if(node==null) //if map doesn't contains character c
            {
                node=new TrieNode();
                current.children.put(c,node);
            }
            current=node;
        }
        current.endOfWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current=root;
        
        for(char c:word.toCharArray())
        {
            TrieNode node=current.children.get(c);
            
            if(node==null)
            {
                return false;
            }
            current=node;
        }
        return current.endOfWord == true ? true : false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current=root;
        
        for(char c:prefix.toCharArray())
        {
            TrieNode node=current.children.get(c);
            
            if(node==null)
            {
                return false;
            }
            current=node;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
