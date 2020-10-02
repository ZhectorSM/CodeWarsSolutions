package codewars;

/*
 * 
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
   N! = 1 * 2 * 3 * ... * N
 * 
 */

public class TrailingZeros {

	public static void main(String[] args) {
		System.out.println("Zeros: " + zeros(0));// 0
		System.out.println("Zeros: " + zeros(6));// 1
		System.out.println("Zeros: " + zeros(12));// 2
		System.out.println("Zeros: " + zeros(14));// 1
		System.out.println("Zeros: " + zeros(827078778));// 1

	}

	public static int zeros(int n) {

		String numStr = String.valueOf(factorial(n));
		System.out.println("fact: " + numStr);
		Character zero = '0';

		int counter = 0;
		for (int i = numStr.length() - 1; i > 0; i--) {
			if (numStr.charAt(i) == zero) {
				counter++;
			} else {
				break;
			}
		}

		return counter;
	}

	public static int factorial(int num) {

		if (num == 0 || num == 1) {
			return 1;
		}

		return num * factorial(num - 1);
	}

}
