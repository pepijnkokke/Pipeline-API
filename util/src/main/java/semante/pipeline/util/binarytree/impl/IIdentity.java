package semante.pipeline.util.binarytree.impl;

import semante.pipeline.BinaryTree;
import semante.pipeline.util.binarytree.Identity;
import semante.pipeline.util.impl.IBinaryTree;

public class IIdentity<A,B> implements Identity<A, B> {
	
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
