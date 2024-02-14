package Programmers;

import java.util.Arrays;

/* 음양 더하기 */
public class Solution_29 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(solution(absolutes, signs));
    }

    static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int abSolutesCnt = absolutes.length;
        for(int i=0; i<abSolutesCnt; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}