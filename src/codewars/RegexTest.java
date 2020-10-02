package codewars;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {

		System.out.println(check("The quick brown fox jumps over the lazy dog."));// true
		System.out.println(check("You shall not pass!"));// false

		System.out.println(alphaChecker("The quick brown fox jumps over the lazy dog"));// true
		System.out.println(alphaChecker("You shall not pass!"));// false

	}

	public static boolean check(String sentence) {

		sentence = sentence.replaceAll("\\W", "");
		String regex = "[a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z+]+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(sentence);
		return m.matches();

	}

	public static boolean alphaChecker(String sentence) {

		String alphabet = "abcdefghijklmnopqrtsuvwxyz";
		for (int i = 0; i < alphabet.length(); i++) {
			if (sentence.toLowerCase().indexOf(alphabet.charAt(i)) < 0) {
				return false;
			}
		}

		return true;
	}

}
