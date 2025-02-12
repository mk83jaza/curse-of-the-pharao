import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
	@Test
	void equalsNull() {
		assertNotEquals(null, new Point(1, 2));
	}

	@Test
	void equalsSameObject() {
		Point samePoint = new Point(3, 2);
		assertEquals(samePoint, samePoint);
	}

	@Test
	void equalsTypeChecking() {
		assertNotEquals("Not the same class", new Point(4, 1));
	}

	@Test
	void equalsTrue() {
		Point point1 = new Point(5, 6);
		Point point2 = new Point(5, 6);
		assertTrue(point1.equals(point2) && point2.equals(point1));
	}

	@Test
	void equalsFalse() {
		assertNotEquals(new Point(1, 2), new Point(5, 6));
	}

	@Test
	void hashCodeTrue() {
		assertEquals(new Point(5, 6).hashCode(), new Point(5, 6).hashCode());
	}

	@Test
	void hashCodeFalse() {
		assertNotEquals(new Point(1, 2).hashCode(), new Point(5, 6).hashCode());
	}

	@Test
	void toStringMethod() {
		assertEquals("Point{x=5.0, y=6.0}", new Point(5, 6).toString());
	}

	@Test
	void pointInBetween() {
		Point point = new Point(50, 50);
		assertEquals(new Point(50, 75), point.calculatePointInBetween(new Point(50, 100)));
	}

	@Test
	void twoPointsCalculateSamePointInBetween() {
		Point point1 = new Point(3.6, 7.8);
		Point point2 = new Point(49.8, 64.9);
		assertEquals(point1.calculatePointInBetween(point2), point2.calculatePointInBetween(point1));
	}

	@Test
	void negativePoint() {
		IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> new Point(5, -1));
		IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> new Point(-5, 1));
		IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> new Point(-5, -1));
		assertEquals("No negative values or null allowed", exception1.getMessage());
		assertEquals("No negative values or null allowed", exception2.getMessage());
		assertEquals("No negative values or null allowed", exception3.getMessage());
	}
}
