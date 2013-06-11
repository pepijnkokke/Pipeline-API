package semante.pipeline.impl;

import semante.pipeline.Pair;
import lombok.experimental.Value;

@Value
public final class IPair<F, S> implements Pair<F, S> {
	
	public static final <F,S> Pair<F,S> pair(F fst, S snd) {
		return new IPair<F,S>(fst, snd);
	}
	
	F first;
    S second;
}