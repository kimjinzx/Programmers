package removePairs;

// 문제 설명
// 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다.
// 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다.
// 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 성공적으로 수행할 수 있으면 1을,
// 아닐 경우 0을 리턴해주면 됩니다.

// 예를 들어, 문자열 S = baabaa 라면
// b aa baa → bb aa → aa →
// 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.
// 제한사항
// 문자열의 길이 : 1,000,000이하의 자연수
// 문자열은 모두 소문자로 이루어져 있습니다.
// 입출력 예
// s	    result
// baabaa	1
// cdcd	    0
// 입출력 예
// 문자열이 남아있지만 짝지어 제거할 수 있는 문자열이 더 이상 존재하지 않기 때문에 0을 반환합니다.

import java.util.Stack;
public class Solution {
    public int solution(String s) { // baabaa
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) { // 스택이 비어있지 않고, top값이 ch와 같다면
                st.pop(); // top값을 삭제
            } else {
                st.push(ch); // 위의 조건에 부합하지 않다면 현재 ch의 값을 추가
            }
        }
        // baabaa일 경우 진행순서
        // 맨처음엔 비어있으므로 b추가
        // b가 들어가있으며 a를 추가하는 과정에서, top값(b)를 peek(조회)하여 ch(b)와 같은지 비교
        // 다르므로 a push(추가)
        // 스택엔 b,a가 있는 상태이며, top값(a)와 ch(a)가 같은지 비교
        // 같으므로 top값(a) 삭제되고 ch(a)도 push되지 않음
        // 해당 구문 반복루프...

        return (st.isEmpty() ? 1 : 0);
    }
}
//public class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        // 방법 2 (StringBuilder 활용)
//        StringBuilder sb = new StringBuilder();
//
//        for (char ch : s.toCharArray()) {
//            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) { // sb가 비어있지 않고 sb의 마지막 문자와 ch의 값이 동일하면
//                sb.deleteCharAt(sb.length() - 1); // sb의 마지막 문자를 삭제
//            } else {
//                sb.append(ch); // 위의 조건에 부합하지 않다면 ch를 append(추가)
//            }
//        }
//        // 방법1과 비슷한 원리와 진행순서 작업이며
//        // 문자열 작업에 용이한 StringBuilder를 사용, 스택대신 lenth의 연산 및 메소드를 사용
//
//        return sb.length() == 0 ? 1 : 0;
//    }
//}
