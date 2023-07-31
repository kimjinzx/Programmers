package nNumbersSpacedByX;

//문제 설명
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
//다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

//제한 조건
//x는 -10000000 이상, 10000000 이하인 정수입니다.
//n은 1000 이하인 자연수입니다.

//입출력 예
// x	n	answer
// 2	5	[2,4,6,8,10]
// 4	3	[4,8,12]
//-4	2	[-4, -8]

public class Solution {
	public long[] solution(int x, int n) { // 2   5
        long[] answer = new long[n]; // n개의 값들이 들어가야 하므로 n을 사용하며 long으로 형변환을 해준다 
        
        for(int i = 0; i<n; i++) { // n값까지 반복문 실행  
        	answer[i] = (long)x * (i+1);  // i는 0부터 시작이니 +1을 하여 x와 곱해주면 배수값이 나옴 
        } // 제한조건을 맞추기 위해 long으로 형변환을 했지만 후에 배열값에 넣기 위해 answer[i]로 해준다 
        
        return answer;
    }
}
