package year2016;

import structure.TreeNode;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
    	if(root == null)
    		return false;
    	
    	return validate(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    private boolean validate(TreeNode node, double min, double max){
    	if(node == null)
    		return true;
    	
    	if(node.val <= min || node.val >= max)
    		return false;
    	
    	return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
