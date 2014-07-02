package semante.pipeline;

import java.util.List;

public interface TestCaseCreator {

	/**
	 * Creats JUnit unit tests based upon the current annotation.
	 * 
	 * @param comment the comment appears before any code
	 * @param text the text is printed to a tree
	 * @param hypothesis the hypothesis is printed to a tree
	 * @param subsumptions newline separated subsumption relations
	 * @param resultType the expected type of result
	 * @return Java source for a JUnit unit test
	 */
	<ID> String createTestCase(
			final String packageName,
			final String className,
			final String comment,
			final BinaryTree<ID, Annotation<ID>> text,
			final BinaryTree<ID, Annotation<ID>> hypo,
			final List<Pair<ID,ID>> subs,
			final ResultType resultType);
	
}
