package optional;

import java.util.ArrayList;
import java.util.Random;

/* Burst an ArrayList by putting so many things into it that you cause an OutOfMemory error. */

public class ArrayOverload {
	
public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			list.add(new Random().nextInt());
		}
		
	}

}
