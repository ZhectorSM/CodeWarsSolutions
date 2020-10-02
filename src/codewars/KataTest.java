package codewars;

/*
 Simple, given a string of words, return the length of the shortest word(s).
 String will never be empty and you do not need to account for different data types.

 */

public class KataTest {

	public static void main(String[] args) {
		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
	}

	public static int findShort(String s) {

		String[] words = s.split(" ");
		int smallest = words[0].length();
		for (String word : words) {
			if (word.length() < smallest) {
				smallest = word.length();
			}

		}

		return smallest;
	}

}
