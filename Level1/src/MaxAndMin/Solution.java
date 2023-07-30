package MaxAndMin;

import java.util.Arrays;

//문제 설명
//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 
//최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

//제한 조건
//s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.

//입출력 예
//s	return
//"1 2 3 4"	"1 4"
//"-1 -2 -3 -4"	"-4 -1"
//"-1 -1"	"-1 -1"

// 계획
// 문자열을 배열에 담아 " "으로 split
// max,min함수로 구분 

public class Solution {
	public String solution(String s) {
        String answer = "";
		
		String str[] = s.split(" "); // 공백을 기준으로 문자열 자르기 
        
        int arr[] = new int[str.length]; // str의 길이를 정수형으로 선언 
        
        
        for(int i = 0; i<str.length; i++){
        	arr[i] = Integer.parseInt(str[i]); // str의 각각의 값들을 정수형으로 변환 
        }
        
        Arrays.sort(arr); //오름차순으로 정렬 
        
        
        int min = arr[0]; // 정렬 된 배열에서 0번째 인덱스 
        int max = arr[str.length -1]; // 정렬 된 배열에서 마지막 인덱
        
        answer = min + " " + max;
        
        return answer;
    }
}
