package tangerine;

public class SolutionRunner {
    public static void main(String[] args) {
        tangerine.Solution sol = new tangerine.Solution();

        int[] tangerineArray = {1, 3, 2, 5, 4, 5, 2, 3};
//        int[] tangerineArray = {1,1,1,1,1,1, 2,2,2,2,2,2, 3,3,3, 4,4,4,4,4, 5,5,5,5,5,5,5};
        int result = sol.solution(7, tangerineArray);

        System.out.println(result);
    }
}
