import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DiggingPointTest {
	@Test
	void equalsNull() {
		assertNotEquals(null, new DiggingPoint(1, 2));
	}

	@Test
	void equalsSameObject() {
		DiggingPoint samePoint = new DiggingPoint(3, 2);
		assertEquals(samePoint, samePoint);
	}

	@Test
	void equalsTypeChecking() {
		assertNotEquals(new DiggingPoint(4,1), "Not the same class");
	}

	@Test
	void equalsTrue() {
		assertEquals(new DiggingPoint(5,6), new DiggingPoint(5, 6));
	}

	@Test
	void equalsFalse() {
		assertNotEquals(new DiggingPoint(1,2), new DiggingPoint(5, 6));
	}

	@Test
	void hashCodeTrue() {
		assertEquals(new DiggingPoint(5,6).hashCode(), new DiggingPoint(5,6).hashCode())	;
	}

	@Test
	void hashCodeFalse() {
		assertNotEquals(new DiggingPoint(1,2).hashCode(), new DiggingPoint(5,6).hashCode());
	}
}
