package divisibleArrayOfNumbers;

//문제 설명
//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

//제한사항
//arr은 자연수를 담은 배열입니다.
//정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.
//array는 길이 1 이상인 배열입니다.

//입출력 예
//arr			 divisor	return
//[5, 9, 7, 10]	 5			[5, 10]
//[2, 36, 1, 3]	 1			[1, 2, 3, 36]
//[3,2,6]		 10			[-1]

//입출력 예#1
//arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.
//입출력 예#2
//arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.
//입출력 예#3
//3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.

import java.util.Arrays;

public class Solution {
	   public int[] solution(int[] arr, int divisor) {
	        
	        int count = 0; // 약수를 반환한 횟수 
	        int index = 0;
	        
	        for(int i = 0; i<arr.length; i++) { // 배열원소값들을 조회하기 위한 반복문 
	        	if(arr[i] % divisor == 0) { // arr의 원소들이 divisor에 약수인지 판단하는 조건문 
	        		count++; // 약수가 나올때마다 카운트됨 
	        	}
	        }
	        
	        if(count == 0) { // count가 0일 경우 약수로 반환되는 원소는 없다는 조건문 
	        	int answer[] = {-1}; // 그러므로 -1 리턴 
	        	return answer; 
	        }
	        
	        int answer[] = new int[count];  // 배열 초기화 
	        
	        // 약수들을 answer[]의 원소로 넣는 작업 
	        for(int i = 0; i<arr.length; i++) { 
	        	if(arr[i] % divisor == 0) {
	        		answer[index] += arr[i];
	        		index++; // 다음 배열 원소추가를 위한 인덱스의 증분식 
	        	}
	        }
	        
	        Arrays.sort(answer); // 오름차순으로 정렬 
	        
	        return answer;
	    }
}
