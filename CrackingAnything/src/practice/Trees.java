package practice;

import java.util.ArrayList;

import structure.TreeNode;

public class Trees {
	
	//4.1
	public boolean isBalanced(TreeNode root){
		if(getTreeDepth(root) == -1)
			return false;
		
		return true;
	}
	
	private int getTreeDepth(TreeNode root){
		
		if(root == null)
			return 0;
		
		int left = getTreeDepth(root.left);
		int right = getTreeDepth(root.right);
		
		if(left == -1 || right == -1 || Math.abs(left-right) > 1)
			return -1;
		
		
		return Math.max(left, right) + 1;
	}
	
	//4.2
	public void routeBetweenNodes(){
		
	}
	
	//4.3
	public TreeNode getMinHeightBST(int[] array){
		return getMinHeightBST(array, 0, array.length-1);
	}
	
	private TreeNode getMinHeightBST(int[] array, int left, int right){
		if(left > right)
			return null;
		
		int mid = (left+right)/2;
		TreeNode root = new TreeNode(array[mid]);
		root.left = getMinHeightBST(array, left, mid-1);
		root.right = getMinHeightBST(array, mid+1, right);
		
		return root;
	}
	
	//4.4
	public ArrayList<ArrayList<TreeNode>> getTreeLinkedList(TreeNode root){
		if(root == null)
			return null;
		
		ArrayList<ArrayList<TreeNode>> lists = new ArrayList<ArrayList<TreeNode>>();
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		list.add(root);
		lists.add(list);
		
		while(!list.isEmpty()){
			ArrayList<TreeNode> current = new ArrayList<TreeNode>();
			for(TreeNode item : list){
				if(item.left != null)
					current.add(item.left);
				if(item.right != null)
					current.add(item.right);
			}
			if(!current.isEmpty())
				lists.add(current);
			list = current;
		}
		return lists;
	}
	
	//4.5
	public TreeNode findNextNode(TreeNode root){
		if(root == null)
			return null;
		else if(root.right != null)
			return getMostLeftNode(root.right);
		else {
			 while(root.parent != null && root != root.parent.right){
				 root = root.parent;
			 }
			 return root;
		}
	}
	
	private TreeNode getMostLeftNode(TreeNode node){
		while(node.left != null){
			node = node.left;
		}
		return node;
	}
	
	//4.6
	public TreeNode commonAncester(TreeNode a, TreeNode b){
		return null;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
