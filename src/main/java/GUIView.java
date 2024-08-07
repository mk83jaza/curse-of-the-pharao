import javax.swing.*;
import java.awt.*;

public class GUIView implements View {
	private final Triangle triangle;
	private final Point startingPoint;

	public GUIView(Triangle triangle, Point startingPoint) {
		this.triangle = triangle;
		this.startingPoint = startingPoint;
		displayStart();
	}

	private void displayStart() {
		JFrame frame = new JFrame();
		frame.setTitle("The Curse of the Pharaoh");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel panel = new DrawPanel();
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void displayNewPosition(Point position) {

	}

	class DrawPanel extends JPanel {
		public DrawPanel() {
			setBorder(BorderFactory.createLineBorder(Color.black));
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(250, 200);
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawTriangle(g);
			g.fillRect(
					(int) startingPoint.getX(), (int) startingPoint.getY(),
					1, 1
			);
		}

		private void drawTriangle(Graphics g) {
			g.drawLine(
					(int) triangle.point1().getX(), (int) triangle.point1().getY(),
					(int) triangle.point2().getX(), (int) triangle.point2().getY()
			);
			g.drawLine(
					(int) triangle.point2().getX(), (int) triangle.point2().getY(),
					(int) triangle.point3().getX(), (int) triangle.point3().getY()
			);
			g.drawLine(
					(int) triangle.point3().getX(), (int) triangle.point3().getY(),
					(int) triangle.point1().getX(), (int) triangle.point1().getY()
			);
		}
	}
}
