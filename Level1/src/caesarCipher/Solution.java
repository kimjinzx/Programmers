package caesarCipher;

//문제 설명
//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
//예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
//문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

//제한 조건
//공백은 아무리 밀어도 공백입니다.
//s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//s의 길이는 8000이하입니다.
//n은 1 이상, 25이하인 자연수입니다.

//입출력 예
//  s		n	result
// "AB"		1	"BC"
// "z"		1	"a"
// "a B z"	4	"e F d"

public class Solution {
	public String solution(String s, int n) {
        String answer = "";
        
        
	        for(int i = 0; i < s.length(); i++) {
	        	char ch = s.charAt(i); // ch에 입력된 문자열 하나씩 담기 
	        	if(ch == ' ') {
	        		answer += ch;
	        		continue; // 공백일 경우 공백을 넣고 다시 반복문 실행하도록 
	        	}
	        				 // isLowerCase = 입력받은 인자가 소문자일 경우 true를 반환 
	        	if(Character.isLowerCase(ch)) { // 소문자일 경우 
	        		answer += (char) ((ch - 'a' + n) % 26 + 'a');
	        		//ascii코드를 활용한 연산식
	        		// a의 아스키값은 97이며 ch가 ab일 때 a - 97 =0, b - 97 =1이 나옴
	        		// ab는 이후 n을 더해 0+1=1, 1+1=2이 된다 
	        		// 26(알바펫개수)으로 나누었을 때 각각 나머지가 1,2로 나오며 해당 값에 a아스키값을 더하면 다음 아스키값으로 조회됨  
	        	}else {
	        		answer += (char) ((ch - 'A' + n) % 26 + 'A');
	        	}
	        }
	        			
        	
        return answer;
    }
}
