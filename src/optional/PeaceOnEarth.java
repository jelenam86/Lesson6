package optional;

import java.util.ArrayList;
import java.util.Iterator;

public class PeaceOnEarth {
	public static void main(String[] args) {
		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('g');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('s');
		truth.add('#');
		truth.add('u');
		truth.add('#');
		truth.add('#');
		truth.add('c');
		truth.add('k');

		/* TODO: Remove the hash symbols and print out the truth. */

//		for (int i = 0; i < truth.size(); i++) {
//			if (truth.get(i).equals('#')) {
//				truth.remove(i);
//				i--;
//			}
//		}

		Iterator<Character> truthIterator = truth.iterator();
		while (truthIterator.hasNext()) {
			Character c = truthIterator.next();
			if (c.equals('#'))
				truthIterator.remove();
		}

		truth.forEach((c) -> System.out.print(c));

	}
}