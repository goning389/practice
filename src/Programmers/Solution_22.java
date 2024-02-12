package Programmers;

import java.util.*;

/* 진료 순서 정하기 */
public class Solution_22 {
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(solution(emergency));
    }

    static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        //배열 복사
        int[] copyOf = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(copyOf);
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(copyOf[i] == emergency[j]){
                    // 헉이다 진짜........내꺼로 습득하고 담번에 이렇게 활용할 수 있을까
                    answer[j] = emergency.length-i;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
