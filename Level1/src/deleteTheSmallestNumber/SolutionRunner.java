package deleteTheSmallestNumber;

import java.util.Arrays;

public class SolutionRunner {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		int[] arr = {10,56,2,8,9};
		int[] answer = sol.solution(arr);
		
		System.out.println(Arrays.toString(answer));
	}

}
