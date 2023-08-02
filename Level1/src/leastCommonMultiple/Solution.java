package leastCommonMultiple;

//문제 설명
//두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
//예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. 
//n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

//제한 사항
//arr은 길이 1이상, 15이하인 배열입니다.
//arr의 원소는 100 이하인 자연수입니다.

//입출력 예
//arr			result
//[2,6,8,14]	168    
//[3,4,6,8] 	24 	  
//[1,2,3]		6

public class Solution {
	public int solution(int[] arr) {
		int answer = 0;

        if(arr.length == 1) return arr[0]; // 원소가 한 개인 경우 바로 출력

        int g = gcd(arr[0], arr[1]); // 처음 두 원소의 최대공약수
        answer = (arr[0] * arr[1]) / g; // 처음 두 원소의 최소공배수

        /*  
        원소의 개수가 3개 이상인 경우
        앞의 두 원소의 최소 공배수와 다음 원소의 최소 공배수를 구하며
        배열의 끝까지 반복
        */ 
        if(arr.length > 2) { 
            for(int i = 2; i < arr.length; i++) {
                g = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / g;
            }
        }

        return answer;
    }

    // 최대 공약수
    private static int gcd(int a, int b) {
        int r = a % b;
        if(r == 0) return b;
        else return gcd(b, r);
    }
}
