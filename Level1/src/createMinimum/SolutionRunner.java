package createMinimum;

public class SolutionRunner {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int a[] = {1,4,2};
		int b[] = {5,4,4};
		
		int num = sol.solution(a,b);
		
		System.out.println(num);
	}
}
