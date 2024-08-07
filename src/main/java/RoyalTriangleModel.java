public class RoyalTriangleModel implements Model {
	private final Triangle triangle;
	private Point diggingPoint;

	public RoyalTriangleModel(Triangle triangle, Point diggingPoint) {
		this.triangle = triangle;
		this.diggingPoint = diggingPoint;
	}

	@Override
	public Point move(Direction direction) {
		Point trianglePoint = triangle.trianglePointOf(direction);
		diggingPoint = diggingPoint.calculatePointInBetween(trianglePoint);
		return diggingPoint;
	}
}
