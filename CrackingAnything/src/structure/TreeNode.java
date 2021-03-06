package structure;

public class TreeNode {
	
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public TreeNode(int v, TreeNode l, TreeNode r){
		this.val = v;
		this.left = l;
		this.right = r;
	}
	
	public TreeNode(int v){
		this.val = v;
		this.left = null;
		this.right = null;
	}
}
