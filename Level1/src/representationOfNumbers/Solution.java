package representationOfNumbers;

//문제 설명
//Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로
//표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

//1 + 2 + 3 + 4 + 5 = 15
//4 + 5 + 6 = 15
//7 + 8 = 15
//15 = 15
//자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

// 제한사항
//n은 10,000 이하의 자연수 입니다.
//입출력 예
//n	result
//15	4
public class Solution {
    public int solution(int n) { // 15
        int answer = 0;

        for(int i = 1; i<=n; i++) { // 연산식의 첫 숫자에 대한 반복문 ( +루프 횟수 설정 )
            int sum = 0; // 루프속 sum선언
            for (int j = i; j<=n; j++) { // 위의 반복문을 사용하여 루프를 돌릴 2중 for문
                sum += j;
                // i값으로 생성된 j를 가지고 덧셈을 차례대로 했을경우 sum이 n값으로 나오는지 여부 판단
                if (sum == n) {
                    answer++; // n값으로 맞아 떨어질 경우 증분
                    break;
                }else if(sum>n) { // n값을 넘어선(맞아 떨어지지 않은) 값이 나올경우 break
                    break;
                }
            }
        }
        return answer;
    }
}
