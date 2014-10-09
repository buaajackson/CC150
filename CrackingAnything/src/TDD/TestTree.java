package TDD;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import practice.Trees;
import structure.TreeNode;

public class TestTree {

	Trees tree;
	TreeNode root;
	
	@Before
	public void init(){
		tree = new Trees();
		
		TreeNode a = new TreeNode(10);
		TreeNode b = new TreeNode(1, null, a);
		TreeNode c = new TreeNode(2, b, null);
		TreeNode d = new TreeNode(4);
		root = new TreeNode(3, c, d);
		
	}
	
	@Test
	public void isBalanced(){
		Assert.assertFalse(tree.isBalanced(root));
	}
	
	@Test
	public void getMinHeightBST(){
		int [] arr = {1,2,3,4,5,6,7};
		TreeNode root = tree.getMinHeightBST(arr);
		Assert.assertEquals(4, root.val);
		Assert.assertEquals(2, root.left.val);
		Assert.assertEquals(1, root.left.left.val);
		Assert.assertEquals(3, root.left.right.val);
		Assert.assertEquals(5, root.right.left.val);
		Assert.assertEquals(6, root.right.val);
		Assert.assertEquals(7, root.right.right.val);
	}
	
	@Test
	public void getTreeLinkedList(){
		ArrayList<ArrayList<TreeNode>> lists = tree.getTreeLinkedList(root);
	}
}
