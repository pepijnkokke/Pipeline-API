package semante.pipeline.impl;

import static lombok.AccessLevel.PRIVATE;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;

import semante.pipeline.BinaryTree;
import semante.pipeline.BinaryTreeBuilder;
import semante.pipeline.BinaryTreeSearcher;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
public final class IBinaryTreeSearcher<A,B> implements BinaryTreeSearcher<A, B> {

	BinaryTreeBuilder<A, B> builder;
	
	@Override
	public final List<BinaryTree<A, B>> findAll(
		Predicate<BinaryTree<A, B>> pred, BinaryTree<A, B> tree) {
		return tree.accept(new IBinaryTreeFinder(pred)).build();
	}
	
	
	
	@RequiredArgsConstructor
	@FieldDefaults(makeFinal = true, level = PRIVATE)
	private final class IBinaryTreeFinder implements BinaryTree.Visitor<A, B, ImmutableList.Builder<BinaryTree<A, B>>> {

		Predicate<BinaryTree<A,B>> pred;

		@Override
		public final ImmutableList.Builder<BinaryTree<A, B>> leaf(B _) {
			return ImmutableList.builder();
		}

		@Override
		public final ImmutableList.Builder<BinaryTree<A, B>> node(A x,
				BinaryTree<A, B> l, BinaryTree<A, B> r) {
			
			// recursively run the findAll function
			val accL = l.accept(this);
			val accR = r.accept(this);
			accL.addAll(accR.build());
			
			// reconstruct the node and check if the predicate holds
			val node = builder.node(x, l, r);
			if (pred.apply(node)) accL.add(node);
			
			// return the new list accumulator
			return accL;
		}
	}

}
