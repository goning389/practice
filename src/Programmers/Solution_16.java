package Programmers;

import java.util.Arrays;

/* 약수의 개수와 덧셈 */
public class Solution_16 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        System.out.println(solution(left, right));
    }

    static int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<= right; i++){
            int sum = 0;
            for(int k=1; k<=i; k++){
                if(i%k == 0){
                    sum++;
                }
            }
            if(sum%2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
