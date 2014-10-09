package practice;

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
}
