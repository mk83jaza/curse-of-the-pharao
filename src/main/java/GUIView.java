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
					(int) triangle.point1().x(), (int) triangle.point1().y(),
					(int) triangle.point2().x(), (int) triangle.point2().y()
			);
			g.drawLine(
					(int) triangle.point2().x(), (int) triangle.point2().y(),
					(int) triangle.point3().x(), (int) triangle.point3().y()
			);
			g.drawLine(
					(int) triangle.point3().x(), (int) triangle.point3().y(),
					(int) triangle.point1().x(), (int) triangle.point1().y()
			);
		}

		private void drawDiggingPoints(Graphics g) {
			for (int i = 0; i < diggingPoints.size(); i++) {
				Point point = diggingPoints.get(i);
				g.fillRect((int) point.x(), (int) point.y(), 1, 1);
			}
		}
	}
}
