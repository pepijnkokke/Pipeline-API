package semante.pipeline.impl;

import lombok.experimental.Value;
import semante.pipeline.Category;

@Value
public class ICategory implements Category {
	String name;
}
