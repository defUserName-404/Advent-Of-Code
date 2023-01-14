package util;

public record Pair <F, S>(F first, S second) {

	public static <F, S> Pair<F,S> of(F a, S b) {
		return new Pair<>(a, b);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Pair<?,?> pair = (Pair<?,?>) o;
		if (!first.equals(pair.first)) {
			return false;
		}
		return second.equals(pair.second);
	}

	@Override
	public int hashCode() {
		return 31 * first.hashCode() + second.hashCode();
	}

}
