package exercises;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

enum Colors {

	orange(Color.ORANGE, "orange"), blue(Color.BLUE, "blue"), red(Color.RED, "red"), green(Color.GREEN, "green"),
	white(Color.WHITE, "white"), yellow(Color.YELLOW, "yellow"), gray(Color.GRAY, "gray"), cyan(Color.CYAN, "cyan"),
	magenta(Color.magenta, "magenta"), pink(Color.PINK, "pink");

	private final Color color;
	private final String name;
	private static final List<Colors> list = Collections.unmodifiableList(Arrays.asList(values()));

	private Colors(Color c, String s) {
		this.color = c;
		this.name = s;
	}

	public String getColorName() {
		return name;
	}
	
	public Color getColor() {
		return color;
	}

	public static Colors setRandomColor() {
		return list.get(new Random().nextInt(list.size()));
	}
}
/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints “Hanging a red ornament”, etc.
 */

public class Ornament {
	
	private String color;
	private Color paint;

	public Ornament() {
		Colors c = Colors.setRandomColor();
		this.color = c.getColorName();
		this.paint = c.getColor();
	}

	public void hang() {
		System.out.println("hanging an ornament");
	}
	
	public void hangColor() {
		if (this.color.equals("orange"))
			System.out.println("hanging an " + this.color + " ornament");
		else
			System.out.println("hanging a " + this.color + " ornament");
	}
	
	public Color getColor() {
		return this.paint;
	}
}
