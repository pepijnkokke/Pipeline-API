package semante.pipeline;

import semante.pipeline.SimpleBinaryTree;
import semante.pipeline.SimpleBinaryTree.Visitor;

public interface SimpleBinaryTreeBuilder<A> extends Visitor<A,SimpleBinaryTree<A>> {
}