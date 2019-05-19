package optional;

public class Inserting {

	public static int[] insertAt(int[] array, int index, int value) {
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i < array.length + 1; i++) {
			if (i == index)
				newArray[index] = value;
			else if (i > index)
				newArray[i] = array[i - 1];
			else
				newArray[i] = array[i];
		}
		return newArray;
	}
	
	public static String[] insertAlphabetically(String[] array, String s) {
		String[] newArray = new String[array.length + 1];
		for(int i = 0; i < array.length; i++)
			newArray[i] = array[i];
		newArray[array.length] = s;
		Sorting.sort(newArray);
		return newArray;
	}
}
