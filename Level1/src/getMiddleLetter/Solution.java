package getMiddleLetter;

//문제 설명
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
//단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

//제한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.

//입출력 예
// s		return
// "abcde"	"c"
// "qwer"	"we"

//public class Solution {
//	// 방법 1 배열초기화 
//	 public String solution(String s) {
//	        String answer = "";
//	        
//	        char[] arr = new char[s.length()]; // s의 크기로 배열선언 
//	        for(int i = 0; i<s.length(); i++) { // s의 문자열을 분해해 arr에 하나씩 배열로 담기 
//	        	arr[i] += s.charAt(i);
//	        }
//	        
//	        int num = 0;
//	        
//	        if(arr.length % 2 == 0) { // arr의 길이가 짝수일 때의 조건 
//	        	
//	        	int numPlusOne = 0; // 해당 조건문에서 사용한 정수 선언 
//	        	
//	        	num = arr.length / 2 - 1; // 인덱스는 0부터 시작하므로 -1을 해줌 
//	        	numPlusOne = arr.length / 2;
//	        	answer += arr[num]; // num과 numPlusOne를 순서대로 담기 
//	        	answer += arr[numPlusOne];
//	        	
//	        }else{ // arr의 길이가 홀수일 때의 조건 
//	        	num = arr.length / 2;
//	        	answer += arr[num];
//	        }
//	        return answer;
//	    }
//}

public class Solution {
	// 방법 2  subString 활용 
	 public String solution(String s) {
	        String answer = "";
	        String str = "";
	        
	        int sLength = s.length(); // s의 length를 정수로 선언 
	        
	        if(sLength % 2 == 0) { // 선언한 정수만 사용한 조건문, 짝수일 때 
	        	str = s.substring(sLength / 2 - 1, sLength / 2 + 1); 
	        	// s의 길이가 6이라면 subString으로 인덱스 2~3까지 (2부터 4전까지인 3까지) 출력  
	        }else { // 홀수 일 때 
	        	str = s.substring(sLength / 2, sLength / 2 + 1 ); 
	        	// s의 길이가 7이라면 subString으로 인덱스 3만 출력 (3부터 4전까지 출력이므로 3만출력)
	        }
	        
	        	answer = str;
	        
	        return answer;
	 }
 }
