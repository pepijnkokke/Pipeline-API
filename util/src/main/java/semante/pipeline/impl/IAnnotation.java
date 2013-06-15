package semante.pipeline.impl;

import lombok.experimental.Value;
import semante.pipeline.Annotation;

@Value
public final class IAnnotation implements Annotation {
	
	String text;
	String category;
	
	@Override
	public final <X> X accept(Visitor<X> v) {
		return v.annotation(text, category);
	}
}
