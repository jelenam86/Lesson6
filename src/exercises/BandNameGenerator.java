package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	
	private static ArrayList<String> createList(String path){
		ArrayList<String> list = new ArrayList<String>();
		int lines = 0;
		try {
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File(path)));
			lnr.skip(Long.MAX_VALUE);
			lines = lnr.getLineNumber();
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			for (int i = 0; i < lines; i++) {
				list.add(br.readLine());
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {

		ArrayList<String> adjectives = createList("resource/adjectives");
		ArrayList<String> nouns = createList("resource/nouns");

		System.out.println("Band Name: " + adjectives.get(new Random().nextInt(adjectives.size())) + " "
				+ nouns.get(new Random().nextInt(nouns.size())));
	}

}
