package carpet;

import java.util.Arrays;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] color = sol.solution(10,2);

        System.out.println(Arrays.toString(color));
    }
}
