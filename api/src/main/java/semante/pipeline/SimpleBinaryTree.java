package semante.pipeline;


public interface SimpleBinaryTree<A> {
	<X> X accept(Visitor<A,X> v);
	
	public interface Visitor<A,X> {
		X node(SimpleBinaryTree<A> l, SimpleBinaryTree<A> r);
		X leaf(A value);
	}
}