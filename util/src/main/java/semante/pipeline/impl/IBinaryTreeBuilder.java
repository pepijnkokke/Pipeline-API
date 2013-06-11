package semante.pipeline.impl;

import semante.pipeline.BinaryTree;
import semante.pipeline.BinaryTreeBuilder;

public class IBinaryTreeBuilder<A,B> implements BinaryTreeBuilder<A, B> {
	
	@Override
	public BinaryTree<A, B> node(A value, BinaryTree<A, B> l,
			BinaryTree<A, B> r) {
		return IBinaryTree.node(value,l,r);
	}
	
	@Override
	public BinaryTree<A, B> leaf(B value) {
		return IBinaryTree.leaf(value);
	}
}
