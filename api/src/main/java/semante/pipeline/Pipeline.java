package semante.pipeline;

import java.util.List;

public interface Pipeline extends TestCaseCreator {
	
	/**
	 * Attempts to prove an entailment relation.
	 * 
	 * @param text the entailment text
	 * @param hypothesis the entailment hypothesis
	 * @param subsumptions the applicable subsumption relations
	 * @return a {@link Result} object
	 * @throws Exception if either the text or the hypothesis is not well-typed or reducible to first-order logic
	 */
	<ID> Result<ID> prove(
			final BinaryTree<ID, Annotation> text,
			final BinaryTree<ID, Annotation> hypothesis,
			final Iterable<Pair<BinaryTree<ID, Annotation>, BinaryTree<ID, Annotation>>> subsumptions) throws Exception;
	
	/**
	 * Provides the user with a list of all categories supported by the current lexicon.
	 * 
	 * @return a list of all categories
	 */
	List<Category> getCategories();
  
}
