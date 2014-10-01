package structure;

public class TreeNode {
	public int val;
	public TreeNode next;
	
	public TreeNode(int v, TreeNode t){
		this.val = v;
		this.next = t;
	}
	
	public TreeNode(int v){
		this.val = v;
		this.next = null;
	}
}
