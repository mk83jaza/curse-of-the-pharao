import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
		assertNotEquals(new Point(4,1), "Not the same class");
	}

	@Test
	void equalsTrue() {
		assertEquals(new Point(5,6), new Point(5, 6));
	}

	@Test
	void equalsFalse() {
		assertNotEquals(new Point(1,2), new Point(5, 6));
	}

	@Test
	void hashCodeTrue() {
		assertEquals(new Point(5,6).hashCode(), new Point(5,6).hashCode())	;
	}

	@Test
	void hashCodeFalse() {
		assertNotEquals(new Point(1,2).hashCode(), new Point(5,6).hashCode());
	}
}
