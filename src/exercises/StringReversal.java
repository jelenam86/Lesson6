package exercises;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
		
		System.out.println(reverseMe("IKTFBEh_CY1=v?hctaw/moc.ebutuoy"));
	}

//	public String reverseMe(String s) {
//	String reverse = "";
//	for(int i = s.length()-1; i >= 0; i--) {
//		reverse += s.charAt(i);
//	}
//	return reverse;
//}

	public String reverseMe(String s) {
		String reverse = "";
		char[] givenString = s.toCharArray();
		for (int i = givenString.length - 1; i >= 0; i--) {
			reverse += givenString[i];
		}
		return reverse;
	}

}
