package countPAndY;

//문제 설명
//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 
//다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
//단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

//제한사항
//문자열 s의 길이 : 50 이하의 자연수
//문자열 s는 알파벳으로만 이루어져 있습니다.

//입출력 예
// s			answer
// "pPoooyY"	true
// "Pyy"		false
//입출력 예 설명
//입출력 예 #1
//'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.
//
//입출력 예 #2
//'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.


// 순서 s의 문자열을 split으로 분리하여 배열로 선언
// 분리되었을 때 p와 y의 아스키값을 사용하여 조건문으로 p,y선별
// 조건문에 countp ++ 등 사용하여 값 비교 
public class Solution {
	boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase(); // s의 문자열을 모두 소문자로 변경 
        int countP = 0;
        int countY = 0;

        for(int i = 0; i<s.length(); i++) { // s의 길이만큼 반복문 실행 
        	if(s.charAt(i) == 'p') { // s의 문자값을 p와 대조
        		countP++; // 대조되면 증분 
        	}else if(s.charAt(i) == 'y') { // s의 문자값을 y와 대조
        		countY++; // 대조되면 증분 
        	}
        }
        
        if(countP == countY) { // 증분된 변수들의 값들이 일치하면 true리턴 
        	answer = true;
        }else {
        	answer = false;
        }
        
        return answer;
    }
}
