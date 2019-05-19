package optional;

import java.util.ArrayList;

public class LearningArrayLists {

	public static ArrayList createArrayList() {
		return new ArrayList();
	}

	private static int numberOfAddedItems = 0;

	public static int addToArrayList(ArrayList list, String s) {
		list.add(s);
		numberOfAddedItems++;
		return numberOfAddedItems;
	}

	public static int getNumberOfItems(ArrayList list) {
		return list.size();
	}

	public static Object getItem(ArrayList list, int index) {
		return list.get(index);
	}

	public static String iterateOver(ArrayList list) {
		String s = "";
		for (Object o : list)
			s += o;
		return s;
	}

	public static int findItemOnList(ArrayList list, String o) {
		return list.indexOf(o);
	}

	public static Object replaceItem(ArrayList list, int index, String o) {
		list.add(index, o);
		list.remove(index + 1);
		return list.get(index);
	}

	public static Object insertItem(ArrayList list, int index, String o) {
		list.add(index, o);
		return list.get(index);
	}

	public static ArrayList<Integer> createTypedArrayList() {
		return new ArrayList<Integer>();
	}

	public static Integer addAllInteger(ArrayList<Integer> list) {
		Integer count = new Integer(0);
		for (Integer i : list)
			count += i;
		return count;
	}

	public static ArrayList<String> createStringTypedArrayList() {
		return new ArrayList<String>();
	}

	public static String addAllString(ArrayList<String> list) {
		String concatenate = "";
		for (String s : list)
			concatenate += s;
		return concatenate;
	}
}
