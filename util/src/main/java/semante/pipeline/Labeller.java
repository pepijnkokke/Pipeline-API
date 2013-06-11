package semante.pipeline;

import java.io.Serializable;

import semante.pipeline.BinaryTree;
import semante.pipeline.SimpleBinaryTree;

public interface Labeller extends Serializable {
	
	<B> BinaryTree<Integer,B> label(final SimpleBinaryTree<B> tree);
	
}
