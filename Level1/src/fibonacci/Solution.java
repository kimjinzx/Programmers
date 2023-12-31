package fibonacci;

// 문제 설명
// 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

// 예를들어
// F(2) = F(0) + F(1) = 0 + 1 = 1
// F(3) = F(1) + F(2) = 1 + 1 = 2
// F(4) = F(2) + F(3) = 1 + 2 = 3
// F(5) = F(3) + F(4) = 2 + 3 = 5
// 와 같이 이어집니다.
// 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.

// 제한 사항
// n은 2 이상 100,000 이하인 자연수입니다.

// 입출력 예
// n	return
// 3	2
// 5	5
// 입출력 예 설명
// 피보나치수는 0번째부터 0, 1, 1, 2, 3, 5, ... 와 같이 이어집니다.


public class Solution {
    public int solution(int n) {

        int answer = 0;
        int fibo = 0;
        int a = 0;
        int b = 1;


        for(int i = 1; i<n; i++) { //피보나치 수의 시작은 0번째 순서부터 0,1,1,2,3,5...로 진행되므로
                                   // 해당 반복문의 n직전의 수가 실제 n값 이다
            fibo = (a%1234567) + (b%1234567);
            // fibo = a+b % 1234567 은
            // fibo = (a%1234567) + (b%1234567) 와 같으므로, 해당 식으로 바꾸어 미리 int의 범위를 제어한다
            a = b;
            b = fibo;
        }

        answer = fibo%1234567;

        return answer;
    }
}


//    public int solution(int n) {  // int 범위초과 **
//
//        int answer = 0;
//        int sum = 0;
//        int a = 0;
//        int b = 1;
//
//
//        for(int i = 1; i<n; i++) { //피보나치 수의 시작은 0번째 순서부터 0,1,1,2,3,5 이므로
//                                   // 해당 반복문의 n직전의 수가 실제 n값 이다
//            sum = a + b;
//            a = b;
//            b = sum;
//            //sum  a b (반복문 진행 순서)
//            // 0
//            // 1 = 0+1
//            // 1 = 1+1
//            // 2 = 1+1
//            // 3 = 1+2
//            // 5 = 2+3 --
//            // 8 = 3+5
//            // 13 = 5+8
//        }
//        answer = sum%1234567;
//        return answer;
//    }