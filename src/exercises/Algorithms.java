package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if (egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> list) {
		int count = 0;
		for (Boolean b : list) {
			if (b == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> list) {
		double height = 0.0;
		for (Double d : list) {
			if (d > height)
				height = d;
		}
		return height;
	}

	public static String findLongestWord(List<String> list) {
		String longestWord = "";
		for (String s : list) {
			if (s.length() > longestWord.length())
				longestWord = s;
		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String sos = list.get(i);
			if (sos.contains("... --- ..."))
				return true;
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> list) {
		// Collections.sort(list);
		list.sort(new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return Double.compare(o1, o2);
			}
		});
		return list;
	}

	public static List<String> sortDNA(List<String> list) {
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String s, String t1) {
				return (s.length() - t1.length());
			}
		});
		return list;
	}

	public static List<String> sortWords(List<String> list) {
		// Collections.sort(list);
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String s, String t1) {
				return s.compareTo(t1);
			}
		});
		return list;
	}

	private static char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',',
			'.', '?', '@', '=', '+', ':', '"', '\n', '-' };

	private static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
			".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--",
			".-.-.-", "..--..", ".--.-.", "-...-", ".-.-.", "---...", ".-..-.", ".-.-", "-....-" };

	public static String morseCodeToEnglish(String morseCode) {
		String translation = "";
		List<String> messageToWords = Arrays.asList(morseCode.split("/"));
		for (String word : messageToWords) {
			List<String> wordToLetters = Arrays.asList(word.split("\\s+"));
			for (int i = 0; i < wordToLetters.size(); i++) {
				for (int j = 0; j < morse.length; j++) {
					if (wordToLetters.get(i).equals(morse[j])) {
						translation += english[j];
					}
				}
			}
			if ((messageToWords.indexOf(word) != messageToWords.size() - 1) && morseCode.contains("/")
					&& (translation.lastIndexOf("\n") != translation.length() - 1))
				translation += " ";
		}
		if (morseCode.contains("/"))
			translation = translation.substring(0, 1).toUpperCase() + translation.substring(1);
		return translation;
	}

	public static String englishToMorseCode(String sentence) {
		String morseCode = "";
		sentence = sentence.toLowerCase();
		List<String> messageToWords = Arrays.asList(sentence.split("\\s+"));
		for (String word : messageToWords) {
			char[] wordToLetters = word.toCharArray();
			for (int i = 0; i < wordToLetters.length; i++) {
				for (int j = 0; j < english.length; j++) {
					if (wordToLetters[i] == english[j]) {
						morseCode = morseCode + morse[j];
						if (i != word.length() - 1)
							morseCode += " ";
					}
				}
			}
			if ((messageToWords.indexOf(word) != messageToWords.size() - 1)
					&& (sentence.lastIndexOf(" ") != sentence.length() - 1))
				morseCode += " / ";
		}
		return morseCode;
	}
}
