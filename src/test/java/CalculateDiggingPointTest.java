import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateDiggingPointTest {
	@Test
	void moveToFIRST() {
		Model model = new RoyalTriangleModel(new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0)), new Point(50, 50));
		assertEquals(new Point(25, 25), model.move(Direction.ONE));
	}

	@Test
	void moveToSECOND() {
		Model model = new RoyalTriangleModel(new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0)), new Point(50, 50));
		assertEquals(new Point(50, 75), model.move(Direction.TWO));
	}

	@Test
	void moveToTHIRD() {
		Model model = new RoyalTriangleModel(new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0)), new Point(50, 50));
		assertEquals(new Point(75, 25), model.move(Direction.THREE));
	}

	@Test
	void moveToAllPoints() {
		Model model = new RoyalTriangleModel(new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0)), new Point(50, 50));
		assertEquals(new Point(50, 75), model.move(Direction.TWO));
		assertEquals(new Point(50, 87.5), model.move(Direction.TWO));
		assertEquals(new Point(25, 43.75), model.move(Direction.ONE));
		assertEquals(new Point(62.5, 21.875), model.move(Direction.THREE));
	}

	@Test
	void moveToNull() {
		Model model = new RoyalTriangleModel(new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0)), new Point(50, 50));
		assertThrows(IllegalArgumentException.class, () -> model.move(null));
	}
}
