package Programmers;

import java.util.*;

/* 로또의 최고 순위와 최저 순위 */
public class Solution_20240129_2 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(solution(lottos, win_nums));
    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] score = {6,6,5,4,3,2,1};
        int[] answer = new int[2];
        int zeroCnt = 0;
        int sameNumCnt = 0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zeroCnt ++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    sameNumCnt ++;
                    break;
                }
            }
        }
        answer[0] = score[sameNumCnt+zeroCnt];
        answer[1] = score[sameNumCnt];
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
