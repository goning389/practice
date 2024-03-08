package Programmers;

import java.util.Arrays;

/* 최댓값 만들기 (2) */
public class Solution_57 {
    public static void main(String[] args) {
        int[] numbers = {0, -31, 24, 10, 1, 9};
        System.out.println(solution(numbers));
    }

    static int solution(int[] numbers) {
        int answer = 0;
        /*for(int i=0; i<numbers.length; i++){
            for(int k=0; k<numbers.length; k++){
                if(i != k){
                    if(answer < numbers[i]*numbers[k]){
                        answer = numbers[i]*numbers[k];
                    }
                }
            }
        }*/

        // 머리를 쓰자..... 모든 경우의 수를 다 구하려고 하지말고 제일 큰 값, 제일 작은 값 이런거 구할 때에는
        // 무조건 Arrays.sort를 활용할 수 있도록.....
        Arrays.sort(numbers);
        int first = numbers[0]*numbers[1];
        int last = numbers[numbers.length-2]*numbers[numbers.length-1];
        if(first > last){
            answer = first;
        } else {
            answer = last;
        }
        return answer;
    }
}