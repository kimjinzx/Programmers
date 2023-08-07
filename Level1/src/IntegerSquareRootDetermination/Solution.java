package IntegerSquareRootDetermination;

//문제 설명
//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

//제한 사항
//n은 1이상, 50000000000000 이하인 양의 정수입니다.

//입출력 예
// n		return
// 121		144
// 3		-1
//입출력 예 설명
//입출력 예#1
//121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
//입출력 예#2
//3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.

// 추가설명 
// n이 어떤 정수의 제곱근인지 찾고 찾은 정수의 +1인 값의 제곱값을 구하기
// n이 제곱근의 값이 아닐경우 -1을 리턴 


// 맨처음에 사용한 코드이지만 검증과정을 통한 공식을 사용하고 싶어 아래 코드로 변경.
// public long solution(long n) {
//    long answer = 0;
//
//    for (long i = 1; i <= n; i++) {
//        if (i * i == n) {
//            answer = (i + 1) * (i + 1);
//            break;
//        }
//        else answer = -1;
//    }
//    return answer;
// }
public class Solution {
	public long solution(long n) {
	    long answer = 0;

	    // 단순 나눗셈,뺄셈으로 제곱근을 구하는 홍길주의 제곱근 구하는 공식법 사용
	    double num = (double) n / 2; // 소수점 처리를 위해 n을 명시적으로 double선언 하여 num값 출력 
	    int i;

	    for (i = 1; i <= n; i++) { 
	        if (num - i > 0) { // num-i의 값이 음수가 나올때 까지 반복문 실행 
	            num -= i;
	        } else {
	            break;
	        }
	    }
	    
	    double squareRoot = num*2;
	    if (squareRoot * squareRoot == n) { // 해당 조건을 마지막으로 제곱근 판별 
	    		// 다시 long으로 선언 
	        answer = (long) ((squareRoot + 1) * (squareRoot + 1)); // 제곱근이 맞다면 해당 연산식 리턴 
	    } else {
	        answer = -1; // 조건문에 부합하지 않다면 제곱수가 아니므로 -1을 리턴 
	    }

	    return answer;
	}

}
