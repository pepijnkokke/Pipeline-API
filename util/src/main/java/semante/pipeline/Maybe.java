package semante.pipeline;

public interface Maybe<A> {

	public interface Visitor<A,X> {
		X just(A value);
		X nothing();
	}
	
	<X> X accept(Visitor<A,X> v);
	
	boolean isJust();
	boolean isNothing();
	A fromJust();
	
}
