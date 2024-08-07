public record Triangle(Point point1, Point point2, Point point3) {
	public Point trianglePointOf(Direction direction) {
		switch (direction) {
			case ONE -> {
				return point1;
			}
			case TWO -> {
				return point2;
			}
			case THREE -> {
				return point3;
			}
			case null, default -> throw new IllegalArgumentException("Unexpected value: " + direction);
		}
	}
}
