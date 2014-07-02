package semante.pipeline;

public interface Annotation<ID> {
	
	public ID 		getId();
	public String 	getText();
	public String 	getCategory();

	public interface Visitor<X,ID> {
		X annotation(ID id, String text, String category);
	}
	
	<X> X accept(Visitor<X,ID> v);
	
}
