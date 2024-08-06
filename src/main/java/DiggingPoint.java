import java.util.Objects;

public class DiggingPoint {
	private final int x;
	private final int y;

	public DiggingPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DiggingPoint that = (DiggingPoint) o;
		return x == that.x && y == that.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
