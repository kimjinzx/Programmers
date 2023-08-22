package correctParentheses;

//문제 설명
// 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
// "()()" 또는 "(())()" 는 올바른 괄호입니다.
// ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
// '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

// 제한사항
// 문자열 s의 길이 : 100,000 이하의 자연수
// 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
// 입출력 예
// s	    answer
// "()()"	true
// "(())()"	true
// ")()("	false
// "(()("	false

//import java.util.Stack;
//public class Solution {
//        boolean solution(String s) {
//
//            Stack<Character> st = new Stack<>(); // Character로 스택선언
//            for(char ch : s.toCharArray()) { // 문자열에 조건을 걸기위한 반복문
//                if(!st.isEmpty() && st.peek() != ch){ // 스택이 비어있지 않고 peek값과 현재 ch값이 다를 경우
//                    if(st.peek() == ')') return false; // ')'로 시작할 경우는 무조건 false를 리턴하도록
//                    st.pop(); // 조건에 부합하면 '(' ')' 끼리 삭제
//                }else {
//                    st.push(ch); // 아니라면 계속 push
//                }
//            }
//            return (st.isEmpty() ? true:false);
//            // 만약 모두 조건문에서 pop이 되었으면 true, pop이 되지 않고 반복문이 끝났다면 false 리턴
//        }
//}


public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // '(' 와 ')' 가 알맞은 순서대로 나올경우 마지막엔 변수count의 값이 0이 되어야함
                count++;
            } else {
                count--;
            }
            if(count < 0) return false;
            // 만약 위 조건문의 첫 루프부터 마이너스 값이 나온다면 s의 첫문자는 ')'이므로 false리턴
        }

        if(count != 0) answer = false; // count의 결과값이 0이 아니라면 false리턴

        return answer;
    }
}