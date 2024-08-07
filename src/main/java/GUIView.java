import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUIView implements View {
	private final Triangle triangle;
	private final List<Point> diggingPoints;
	private JPanel panel;

	public GUIView(Triangle triangle, Point startingPoint) {
		this.triangle = triangle;
		diggingPoints = new ArrayList<>();
		diggingPoints.add(startingPoint);
		displayStart();
	}

	private void displayStart() {
		JFrame frame = new JFrame();
		frame.setTitle("The Curse of the Pharaoh");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);

		panel = new DrawPanel();
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void displayNewPosition(Point position) {
		diggingPoints.add(position);
		panel.repaint();
	}

	class DrawPanel extends JPanel {
		public DrawPanel() {
			setBorder(BorderFactory.createLineBorder(Color.black));
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(1003, 869);
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawTriangle(g);
			drawDiggingPoints(g);
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

		private void drawDiggingPoints(Graphics g) {
			diggingPoints.forEach(point -> g.fillRect((int) point.getX(), (int) point.getY(), 1, 1));
		}
	}
}
