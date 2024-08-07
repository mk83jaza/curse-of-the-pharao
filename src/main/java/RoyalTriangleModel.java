public class RoyalTriangleModel implements Model {
	private final Point trianglePoint1;
	private final Point trianglePoint2;
	private final Point trianglePoint3;
	private Point diggingPoint;

	public RoyalTriangleModel(Point trianglePoint1, Point trianglePoint2, Point trianglePoint3, Point diggingPoint) {
		this.trianglePoint1 = trianglePoint1;
		this.trianglePoint2 = trianglePoint2;
		this.trianglePoint3 = trianglePoint3;
		this.diggingPoint = diggingPoint;
	}

	@Override
	public Point move(Direction direction) {
		Point result;
		if (direction == Direction.ONE) {
			result = diggingPoint.calculatePointInBetween(trianglePoint1);
		} else if (direction == Direction.TWO) {
			result = diggingPoint.calculatePointInBetween(trianglePoint2);
		} else {
			result = diggingPoint.calculatePointInBetween(trianglePoint3);
		}
		diggingPoint = result;
		return result;
	}
}
