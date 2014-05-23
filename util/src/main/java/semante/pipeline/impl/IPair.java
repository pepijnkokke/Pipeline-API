package semante.pipeline.impl;

import com.google.common.base.Function;

import semante.pipeline.Pair;
import lombok.experimental.Value;

@Value
public final class IPair<F, S> implements Pair<F, S> {
	
	public static final <F,S> Function<Pair<F,S>,F> first() {
		return new Function<Pair<F,S>,F>() {
			@Override
			public final F apply(Pair<F, S> p) {
				return p.getFirst();
			}
		};
	}
	
	public static final <F,S> Function<Pair<F,S>,S> second() {
		return new Function<Pair<F,S>,S>() {
			@Override
			public final S apply(Pair<F, S> p) {
				return p.getSecond();
			}
		};
	}
	
	public static final <F,S> Pair<F,S> pair(F fst, S snd) {
		return new IPair<F,S>(fst, snd);
	}
	
	F first;
    S second;
}