package TDD;

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
}
