package nNumbersSpacedByX;

import java.util.Arrays;

public class SolutionRunner {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		long[] result = sol.solution(2, 5);
		
		System.out.println(Arrays.toString(result));
	}

}
