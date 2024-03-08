package Programmers;

import java.util.Arrays;

/* 가까운 1 찾기 */
public class Solution_58 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 0};
        int idx = 4;
        System.out.println(solution(arr, idx));
    }

    static int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i=idx; i<arr.length; i++){
            if(arr[i] == 1){
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}