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
		when(model.move(Direction.TWO)).thenReturn(new Point(50, 75));

		controller.onMove(Direction.TWO);

		verify(view).displayNewPosition(new Point(50, 75));
	}
}
