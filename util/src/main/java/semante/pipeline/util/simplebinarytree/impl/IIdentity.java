package semante.pipeline.util.simplebinarytree.impl;

import semante.pipeline.util.SimpleBinaryTree;
import semante.pipeline.util.impl.ISimpleBinaryTree;
import semante.pipeline.util.simplebinarytree.Identity;

public class IIdentity<A> implements Identity<A> {
	
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

