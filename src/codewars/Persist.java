package codewars;

public class Persist {

	public static void main(String[] args) {
		System.out.println("result = " + persistence(39));// 3
		System.out.println("result = " + persistence(999));// 4
		System.out.println("result = " + persistence(4));// 0
	}

	public static int persistence(long n) {

		String numStr = String.valueOf(n);
		int count = 0;

		while (numStr.length() != 1) {
			count++;
			numStr = processNumber(numStr);
		}

		return count;
	}

	public static String processNumber(String numStr) {
		long newNum = 1;
		for (int i = 0; i < numStr.length(); i++) {
			newNum = newNum * Long.parseLong(numStr.charAt(i) + "");
		}
		return String.valueOf(newNum);
	}

}
