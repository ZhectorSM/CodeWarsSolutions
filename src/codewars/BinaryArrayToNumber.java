package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {

	public static void main(String args[]) {
		System.out.println(ConvertBinaryArrayToInt(Arrays.asList(0, 0, 0, 1)));
		System.out.println(ConvertBinaryArrayToInt(Arrays.asList(1, 1, 1, 1)));
		System.out.println(ConvertBinaryArrayToInt(Arrays.asList(0, 1, 1, 0)));
		System.out.println(ConvertBinaryArrayToInt(Arrays.asList(1, 0, 0, 1)));

	}

	public static int ConvertBinaryArrayToInt(List<Integer> binary) {

		int pow = 1;
		int result = 0;
		Collections.reverse(binary);

		for (Integer bit : binary) {
			result += bit * pow;
			pow = pow * 2;
		}

		return result;
	}

}
