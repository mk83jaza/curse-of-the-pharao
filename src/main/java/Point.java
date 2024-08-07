public record Point(double x, double y) {
	public Point {
		if (x < 0 || y < 0) throw new IllegalArgumentException("No negative values or null allowed");
	}

	public Point calculatePointInBetween(Point other) {
		return new Point(
				(this.x + other.x) / 2,
				(this.y + other.y) / 2
		);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Point that = (Point) o;
		return x == that.x && y == that.y;
	}

	@Override
	public String toString() {
		return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
}
