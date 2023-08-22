package englishEnding;


public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] start = sol.Solution(4,new String[]{"tank","kick","know","wheel","land","dream","mother","robot"});

        System.out.println(start);
    }
}
