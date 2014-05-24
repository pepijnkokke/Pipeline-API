package semante.pipeline.impl;

import lombok.experimental.Value;
import semante.pipeline.Maybe;

public abstract class IMaybe<A> implements Maybe<A> {
	
	public static final <A> Maybe<A> just(final A value) {
		return new IJust<A>(value);
	}
	
	public static final <A> Maybe<A> nothing() {
		return new INothing<A>();
	}

	@Value
	private static final class IJust<A> implements Maybe<A> {

		A value;
		
		@Override
		public final boolean isJust() {
			return true;
		}

		@Override
		public final boolean isNothing() {
			return false;
		}

		@Override
		public final A fromJust() {
			return value;
		}

		@Override
		public final <X> X accept(semante.pipeline.Maybe.Visitor<A, X> v) {
			return v.just(value);
		}
		
	}
	
	@Value
	private static final class INothing<A> implements Maybe<A> {

		@Override
		public final boolean isJust() {
			return false;
		}

		@Override
		public final boolean isNothing() {
			return true;
		}

		@Override
		public final A fromJust() {
			return null;
		}
		
		@Override
		public final <X> X accept(semante.pipeline.Maybe.Visitor<A, X> v) {
			return v.nothing();
		}
		
	}
	
}
