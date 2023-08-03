package divisibleArrayOfNumbers;

import java.util.Arrays;

public class SolutionRunner {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
		int[] result = sol.solution(new int[]{1, 2, 3, 4}, 2); 
								// new int[]사용하여 배열 초기화 하고 메소드 전달 
		
		System.out.println(Arrays.toString(result)); 
		// 배열 자체 출력이 아닌 배열 요소 출력하는 Arrays.toString사용 
	}

}
