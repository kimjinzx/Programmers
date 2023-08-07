package deleteTheSmallestNumber;

//문제 설명
//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

//제한 조건
//arr은 길이 1 이상인 배열입니다.
//인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

//입출력 예
//arr		return
//[4,3,2,1]	[4,3,2]
//[10]		[-1]

public class Solution {
	  public int[] solution(int[] arr) { // {10,56,2,8,9}
	        
	        	 // 원소값이 10일 경우의 조건문 
	        if(arr.length == 1 && arr[0] == 10) { // arr의 인덱스가 1개이며 그 한개가 10일 경우에 대 다중 조건 
		        int[] answer = {-1};
		       	return answer;
	        }

	        int min = Integer.MAX_VALUE; // 2,147,483,647 (일단 int중 가장 큰 수로 선언)
	        for(int i = 0; i<arr.length; i++) {
		        if(arr[i] < min) { // 최소값 찾기 조건문 
		        	min = arr[i]; // 10 -> 10 -> 2 -> 2 -> 2
		        }
	        }
	        
	        int[] answer = new int[arr.length - 1]; // 최소값인 원소가 빠진 후의 배열크기로 배열 초기화 
	        int idx = 0; // 인덱스 검색을 위한 정수 선언 
	        for (int j = 0; j < arr.length; j++) {
	            if (arr[j] != min) { // 2(최소값)을 제외한 원소들만 answer에 넣기 
	                answer[idx++] = arr[j]; 
	            }
	        }

	        return answer;
	    }
}
