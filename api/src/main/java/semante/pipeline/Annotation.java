package semante.pipeline;

public interface Annotation {
	
	public String getText();
	public String getCategory();

	public interface Visitor<X> {
		X annotation(String text, String category);
	}
	
	<X> X accept(Visitor<X> v);
	
}
