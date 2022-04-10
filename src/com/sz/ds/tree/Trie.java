package com.sz.ds.tree;

public class Trie {
	
	private TrieNode root;

	public static void main(String[] args) {

	}
	
	
	/** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        
        for (int i = 0; i< word.length(); i++) {
        	char currChar = word.charAt(i);
        	
        	if(!node.containsKey(currChar)) {
        		node.putNode(currChar, new TrieNode());
        	} 
        	
        	node = node.getNode(currChar);
      
        }
        
        node.setEnd();
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        
        for(int i = 0; i< word.length(); i++) {
        	char currChar = word.charAt(i);
        	if(node.containsKey(currChar)) {
        		node = node.getNode(currChar);
        	}else {
        		return false;
        	}
        }
        
        return node != null && node.isEnd();
    	
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        
        for(int i =0 ; i< prefix.length(); i++) {
        	if(node.containsKey(prefix.charAt(i))) {
        		node = node.getNode(prefix.charAt(i));
        	}else {
        		return false;
        	}
        }
        
        return node!=null;
        
    }

}

class TrieNode {

	private TrieNode[] links;

	private boolean isEnd;

	public TrieNode() {
		links = new TrieNode[26];
	}

	public void putNode(char ch, TrieNode node) {
		links[ch - 'a'] = node;
	}

	public TrieNode getNode(char ch) {
		return links[ch - 'a'];
	}

	public boolean containsKey(char ch) {
		return links[ch - 'a'] != null;
	}

	public void setEnd() {
		isEnd = true;
	}

	public boolean isEnd() {
		return isEnd;
	}

}
