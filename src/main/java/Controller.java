public class Controller {
	private final View view;
	private final Model model;

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	public void onMove(Direction direction) {
		Point point = model.move(direction);
		view.displayNewPosition(point);
	}
}
