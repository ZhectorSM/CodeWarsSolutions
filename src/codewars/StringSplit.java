package codewars;

import java.util.Arrays;

/*
 * 
 * Complete the solution so that it splits the string into pairs of two characters.
 *  If the string contains an odd number of characters then it should replace the missing 
 *  second character of the final pair with an underscore ('_').
 */

public class StringSplit {

	public static void main(String[] args) {
		System.out.println("Result : " + Arrays.deepToString(solution("abcdef")));
		System.out.println("Result : " + Arrays.deepToString(solution("HelloWorld")));
		System.out.println("Result : " + Arrays.deepToString(solution("LovePizza")));

	}

	public static String[] solution(String s) {

		int size = (int) Math.ceil(s.length() / 2);
		if (s.length() % 2 != 0) {
			size += 1;
			s += "_";
		}

		String[] pairs = new String[size];
		String tmp = "";
		int pos = 0;
		int counter = 0;

		for (int i = 0; i < s.length(); i++) {
			tmp += s.charAt(i);
			counter++;

			if (counter % 2 == 0) {
				pairs[pos] = tmp;
				tmp = "";
				counter = 0;
				pos++;
			}

		}

		return pairs;
	}

}
