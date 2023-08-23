package englishEnding;


import java.util.Arrays;
public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot"});

        System.out.println(Arrays.toString(result)); // Convert array to string and print
    }
}
