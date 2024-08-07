public class RoyalTriangleModel implements Model {
	private final Point trianglePoint1;
	private final Point trianglePoint2;
	private final Point trianglePoint3;
	private final Point diggingPoint;

	public RoyalTriangleModel(Point trianglePoint1, Point trianglePoint2, Point trianglePoint3, Point diggingPoint) {
		this.trianglePoint1 = trianglePoint1;
		this.trianglePoint2 = trianglePoint2;
		this.trianglePoint3 = trianglePoint3;
		this.diggingPoint = diggingPoint;
	}

	@Override
	public Point calculateNewDiggingPoint(TrianglePointNr trianglePointNr) {
		return new Point(50, 75);
	}
}
