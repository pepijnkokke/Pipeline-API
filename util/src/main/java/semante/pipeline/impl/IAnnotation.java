package semante.pipeline.impl;

import lombok.experimental.Value;
import semante.pipeline.Annotation;

@Value
public final class IAnnotation<ID> implements Annotation<ID> {
	
	ID	id;
	String text;
	String category;
	
	@Override
	public final <X> X accept(Visitor<X,ID> v) {
		return v.annotation(id, text, category);
	}
}
