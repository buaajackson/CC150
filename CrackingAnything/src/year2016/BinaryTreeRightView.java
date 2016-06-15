package year2016;

import java.util.ArrayList;
import java.util.List;
import structure.TreeNode;

public class BinaryTreeRightView {
	public List<Integer> rightSideView(TreeNode root) {
		List<TreeNode> parent = new ArrayList<TreeNode>();
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;

		parent.add(root);
		result.add(root.val);
		while (!parent.isEmpty()) {
			List<TreeNode> children = new ArrayList<TreeNode>();
			
			for (int i = parent.size() - 1; i >= 0; i--) {
				
				if (parent.get(i).right != null) {
					children.add(parent.get(i).right);
				}
				if (parent.get(i).left != null) {
					children.add(parent.get(i).left);
				}
			}
			
			if(!children.isEmpty()){
				result.add(children.get(0).val);
			}
			parent = children;
		}
		
		return result;
	}
}
