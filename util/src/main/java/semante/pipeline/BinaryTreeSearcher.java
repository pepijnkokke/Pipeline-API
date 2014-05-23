package semante.pipeline;

import java.util.List;

import com.google.common.base.Predicate;

public interface BinaryTreeSearcher<A,B> {

	List<BinaryTree<A,B>> findAll(Predicate<BinaryTree<A,B>> p, BinaryTree<A,B> t);
	
}
