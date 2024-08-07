import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(new Point(0, 866), new Point(500, 0), new Point(1000, 866));
		Point startingPoint = new Point(0, 0);
		Model model = new RoyalTriangleModel(triangle, startingPoint);
		View view = new GUIView(triangle, startingPoint);
		Controller controller = new Controller(view, model);

		Random rand = new Random();
		for (int i = 0; i < 1000000; i++) {
			Direction randomDirection = Direction.values()[rand.nextInt(3)];
			controller.onMove(randomDirection);
		}
	}
}
