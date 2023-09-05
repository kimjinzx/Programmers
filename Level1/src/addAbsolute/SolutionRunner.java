package addAbsolute;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int power = sol.solution(absolutes, signs);

        System.out.println(power);
    }
}
