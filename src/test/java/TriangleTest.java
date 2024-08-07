import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleTest {
	@Test
	void firstPoint() {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0));
		assertEquals(new Point(0, 0), triangle.trianglePointOf(Direction.ONE));
	}

	@Test
	void secondPoint() {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0));
		assertEquals(new Point(50, 100), triangle.trianglePointOf(Direction.TWO));
	}

	@Test
	void thirdPoint() {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0));
		assertEquals(new Point(100, 0), triangle.trianglePointOf(Direction.THREE));
	}

	@Test
	void nullDirection() {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0));
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> triangle.trianglePointOf(null));
		assertEquals("Unexpected value: null", exception.getMessage());
	}
}
