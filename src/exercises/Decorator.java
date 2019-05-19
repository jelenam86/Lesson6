package exercises;

import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Decorator {

	private ArrayList<Ornament> boxOfDecorations;
	Robot robot = new Robot("mini");

	public Decorator() {
		this.boxOfDecorations = new ArrayList<Ornament>();
		int size = new Random().nextInt(20) + 1;
		for (int i = 0; i < size; i++)
			boxOfDecorations.add(new Ornament());
		System.out.println("The box contains " + size + " ornaments.");

	}

	public void hangAll() {
		for (Ornament o : boxOfDecorations) {
			o.hangColor();
			drawAnOrnament(o);
		}
	}
	
	private void drawAnOrnament(Ornament o) {
		robot.setPenWidth(10);
		robot.setSpeed(100);
		robot.setPenColor(o.getColor());
		robot.penDown();
		
		Ellipse2D shape = new Ellipse2D.Float();
		shape.setFrame(new Random().nextInt(900), new Random().nextInt(600), 30, 30);
		PathIterator path = shape.getPathIterator(new AffineTransform());
		
		robot.followPath(path);
		robot.setPos(20, 20);
	}

	public static void main(String[] args) {

		new Decorator().hangAll();
	}
}
