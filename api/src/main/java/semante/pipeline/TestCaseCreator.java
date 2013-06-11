package semante.pipeline;

public interface TestCaseCreator {

	/**
	 * Creats JUnit unit tests based upon the current annotation.
	 * 
	 * @param comment the comment appears before any code
	 * @param text the text is printed to a tree
	 * @param hypothesis the hypothesis is printed to a tree
	 * @param subsumptions newline separated subsumption relations
	 * @return Java source for a JUnit unit test
	 */
	<ID> String createTestCase(
			final String name,
			final String comment,
			final BinaryTree<ID, Annotation> text,
			final BinaryTree<ID, Annotation> hypothesis,
			final String subsumptions);
}
