import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDiggingPointTest {
	@Test
	void calculateSECOND() {
		Model model = new RoyalTriangleModel(new Point(0, 0), new Point(50, 100), new Point(100, 0), new Point(50,50));
		assertEquals(new Point(50, 75), model.calculateNewDiggingPoint(TrianglePointNr.TWO));
	}
}
