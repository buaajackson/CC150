package year2016;

import java.util.Map;

public class AddAndSearchWord {
	TrieNode root;
	
	public void addWord(String word){
		Map<Character, TrieNode> children = root.children;
		TrieNode node = null;
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			if(children.containsKey(c)){
				node = children.get(c);
			} else {
				node = new TrieNode(c);
				children.put(c, node);
			}
			children = node.children;
			
			if(i == word.length()-1){
				node.isLeaf = true;
			}
		}
	}
	
	public boolean findWord(String word){
		Map<Character, TrieNode> children = root.children;
		TrieNode node = null;
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			if(children.containsKey(c)){
				node = children.get(c);
				children = node.children;
			} else if()
		}
	}
	
}

class TrieNode{
	char c;
	boolean isLeaf;
	Map<Character, TrieNode> children;
	
	TrieNode(){	}
	
	TrieNode(char c){
		this.c = c;
	}
}
