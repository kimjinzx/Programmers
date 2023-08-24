package createMinimum;

//문제 설명...
//길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
//배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 
//두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. 
//(단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)

//예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면
//A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
//A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
//A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)
//즉, 이 경우가 최소가 되므로 29를 return 합니다.
//배열 A, B가 주어질 때 최종적으로 누적된 최솟값을 return 하는 solution 함수를 완성해 주세요.

//제한사항
//배열 A, B의 크기 : 1,000 이하의 자연수
//배열 A, B의 원소의 크기 : 1,000 이하의 자연수
//입출력 예
//  A			 B			answer
// [1, 4, 2]	[5, 4, 4]	29
// [1,2]		[3,4]		10

//입출력 예 설명
//A에서 첫번째 숫자인 1, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. 
//(누적된 값 : 4) 다음, A에서 두번째 숫자인 2, B에서 첫번째 숫자인 3을 뽑아 곱하여 더합니다. (누적된 값 : 4 + 6 = 10)
//이 경우가 최소이므로 10을 return 합니다

import java.util.Arrays;
//import java.util.Collections;
public class Solution {
	public int solution(int[] A, int[] B) { // [1,4,2] [5,4,4]
			int answer = 0;
			
			// 가장 높은수는 가장 낮은 수와 곱셈을 반복(배열의 길이만큼)하면 정답이 나옴 (중복 숫자를 제외한.)
			// 배열을 각각 하나는 오름차순, 하나는 내림차순으로 배열 정렬 
			// A를 Integer로 박싱 후 Collections.reverseOrder()을 사용해 내림차순으로 정렬하고
			// B는 sort를 사용해 오름차순으로 정렬하여 반복문의 연산식으로 정답을 출력했지만,
			// 프로그래머스 효율성 테스트에서 시간초과로 실패되어 
			// 그냥 둘다 오름차순으로 배열정렬을 하고,
			// 연산식에서 A의 인덱스를 뺄셈하여 내림차순으로 정의함 
			// - 효율성 테스트 통과-
			
			Arrays.sort(A); // [1,2,4]
			Arrays.sort(B); // [4,4,5]
			
			for(int i = 0; i<A.length; i++) { 
				answer += (A[A.length-i-1]*B[i]); 
			}
			
			return answer;
		}
}

//	public int solution(int[] A, int[] B) { // [1,4,2] [5,4,4]
//		int answer = 0;
//		
		// 가장 높은수는 가장 낮은 수와의 곱셈을 반복(배열의 길이만큼)하면 정답이 나옴 (중복 숫자를 제외한.)
		// 길이가 같은 배열을 각각 A는 내림차순, B는 오름차순으로 배열 정렬
		// Integer 박싱 후 Collections을 사용하여 A배열을 내림차순으로 정렬하니 
		// 프로그래머스의 효울성테스트(시간초과)로 실패 

//		Integer[] newA = Arrays.stream(A).boxed().toArray(Integer[]::new); // Integer로 형변환 (박싱) 
//		Arrays.sort(newA, Collections.reverseOrder()); // Integer로 변환 후 정수 내림차순 정렬 
//		Arrays.sort(B); 
//		
//		for(int i = 0; i<A.length; i++) {
//			answer += newA[i]*B[i];
//		}
//		
//		return answer;
//	}