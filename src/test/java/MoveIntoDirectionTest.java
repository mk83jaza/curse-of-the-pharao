import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MoveIntoDirectionTest {
	@Test
	void moveNorth() {
		View view = mock(View.class);
		Model model = mock(Model.class);
		Controller controller = new Controller(view, model);
		when(model.calculateNewDiggingPoint(TrianglePointNr.TWO)).thenReturn(new DiggingPoint(50, 75));

		controller.onMove(TrianglePointNr.TWO);

		verify(view).displayNewPosition(new DiggingPoint(50, 75));
	}

	public interface View {
		void displayNewPosition(DiggingPoint position);
	}

	public interface Model {
		DiggingPoint calculateNewDiggingPoint(TrianglePointNr trianglePointNr);
	}

	public static class Controller {
		private final View view;
		private final Model model;

		public Controller(View view, Model model) {
			this.view = view;
			this.model = model;
		}

		public void onMove(TrianglePointNr trianglePointNr) {
			DiggingPoint diggingPoint = model.calculateNewDiggingPoint(trianglePointNr);
			view.displayNewPosition(diggingPoint);
		}
	}
}
