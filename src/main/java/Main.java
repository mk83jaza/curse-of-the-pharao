public class Main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(50, 100), new Point(100, 0));
		Point startingPoint = new Point(50, 50);
		Model model = new RoyalTriangleModel(triangle, startingPoint);
		View view = new GUIView(triangle, startingPoint);
		Controller controller = new Controller(view, model);
		controller.onMove(Direction.TWO);
	}
}
