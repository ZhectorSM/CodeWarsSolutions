package codewars;

/*
 * The goal of this exercise is to convert a string to a new string where each 
 * character in the new string is "(" if that character appears only once in the original 
 * string, or ")" if that character appears more than once in the original string.
 *  Ignore capitalization when determining if a character is a duplicate.
Examples

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 


 */

public class DuplicateEncoder {

	public static void main(String[] args) {
		System.out.println(encode("Prespecialized"));// )()())()(()()(
		System.out.println(encode("   ()(   "));// ))))())))

	}

	static String encode(String word) {

		StringBuilder strEncoded = new StringBuilder();
		word = word.toLowerCase();
		int firstTime = -1;
		int secondTime = -1;
		for (char letter : word.toCharArray()) {
			firstTime = word.indexOf(letter);
			secondTime = word.indexOf(letter, firstTime + 1);// Starting in the next position of the first aparition
			if (secondTime == -1) {
				strEncoded.append("(");
			} else {
				strEncoded.append(")");
			}
		}

		return strEncoded.toString();
	}

}
