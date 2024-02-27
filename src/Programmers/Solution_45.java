package Programmers;

/* 평균 구하기 */
public class Solution_45 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }

    static double solution(int[] arr) {
        double answer = 0;
        int arrCnt = arr.length;
        for(int i=0; i<arrCnt; i++){
            answer += arr[i];
        }
        answer = answer/arrCnt;
        return answer;
    }
}