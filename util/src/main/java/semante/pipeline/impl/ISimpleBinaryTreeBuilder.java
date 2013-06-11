package semante.pipeline.impl;

import semante.pipeline.SimpleBinaryTree;
import semante.pipeline.SimpleBinaryTreeBuilder;

public class ISimpleBinaryTreeBuilder<A> implements SimpleBinaryTreeBuilder<A> {
	
	@Override
	public SimpleBinaryTree<A> node(
			final SimpleBinaryTree<A> l,
			final SimpleBinaryTree<A> r) {
		return ISimpleBinaryTree.node(l,r);
	}
	
	@Override
	public SimpleBinaryTree<A> leaf(A a) {
		return ISimpleBinaryTree.leaf(a);
	}
}

