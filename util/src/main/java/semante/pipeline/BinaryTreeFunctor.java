package semante.pipeline;

import semante.pipeline.BinaryTree;
import semante.pipeline.BinaryTree.Visitor;

public interface BinaryTreeFunctor<A, B, C, D> extends Visitor<A, B, BinaryTree<C, D>> {
}