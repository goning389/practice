package Programmers;

/* 같은 숫자는 싫어 */
public class Solution_9 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }

    static int[] solution(int []arr) {
        int[] answer = {};
        int count = 1;

        for(int i=1; i<arr.length; i++){ //입력한 배열 크기만큼 돌린다.
            if(arr[i-1] != arr[i]){ //이전 숫자와 대조하여 중복되지 않으면 카운팅.
                count++;
            }
        }
        answer = new int[count]; //카운팅된 숫자만큼의 배열 생성
        int answerIdx = 1;
        answer[0] = arr[0]; //첫번째 숫자는 비교하는 대상이 없으니까 그냥 고정값으로 셋팅.
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                answer[answerIdx] = arr[i];
                answerIdx++;
            }
        }
        return answer;
    }
}
