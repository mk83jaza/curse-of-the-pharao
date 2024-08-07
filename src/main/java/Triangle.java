public record Triangle(Point trianglePoint1, Point trianglePoint2, Point trianglePoint3) {
	public Point trianglePointOf(Direction direction) {
		switch (direction) {
			case ONE -> {
				return trianglePoint1;
			}
			case TWO -> {
				return trianglePoint2;
			}
			case THREE -> {
				return trianglePoint3;
			}
			case null, default -> throw new IllegalArgumentException("Unexpected value: " + direction);
		}
	}
}
