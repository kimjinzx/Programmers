package carpet;

// 문제 설명
// Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
// 사진설명 [https://school.programmers.co.kr/learn/courses/30/lessons/42842]
// Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
// Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로,
// 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

// 제한사항
// 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
// 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
// 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
// 입출력 예
// brown	yellow	return
// 10	    2	    [4, 3]
// 8	    1	    [3, 3]
// 24	    24	    [8, 6]

public class Solution {
    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];
        int sum = brown+yellow; // 10+2 = 12

        for(int i = 3; i<sum; i++){ // 중앙에 노란색이 들어가기 위해선 가로세로(약수의 첫번째 수가) 길이가 3이상이어야 함
            int j = sum/i; // j*i=sum 의 역순 = i를 통해 sum의 약수 구하는 식
            if(sum%i==0 && j>=3){ // i가 sum의 약수이면서, j가 3이상일 경우(가로세로(약수의 두번째 수가) 길이가 3이상이어야 함)

                // 위의 약수의 첫번째수와 두번째 수가 모두 3이상인 수일 경우
                int row = Math.min(i,j); // 가로
                int col = Math.max(i,j); // 세로
                int centre = (col-2)*(row-2);

                if(centre == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        // (1,12) (2,6) (3,4) (4,3) (6,2) (12,1) = 12의 모든 약수
        // -> (4,3) (6,2) (12,1) // 가로의 길이는 세로 이상의 크기여야 하므로 1,2,3 제거
        // -> (4,3) // 세로의 크기는 3이상이어야 하므로 2,1제거
        // -> (4,3) 이때 남은 약수들 중 각각 -2를 하여 yellow와 값이 일치한다면 해당 약수가 정답
        // -> (4-2)*(3-2) = 2 , yellow = 2
        // return
        return answer;
    }
}
