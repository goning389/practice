package Programmers;

import java.util.Arrays;

/* 369게임 */
public class Solution_47 {
    public static void main(String[] args) {
        int order = 29423;
        System.out.println(solution(order));
    }

    static int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        String[] arr = str.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}