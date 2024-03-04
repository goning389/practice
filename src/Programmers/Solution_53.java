package Programmers;

/* 수 조작하기 2 */
public class Solution_53 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }

    static String solution(int[] numLog) {
        String answer = "";
        for(int i=0; i<numLog.length-1; i++){
            int num = numLog[i+1]-numLog[i];
            if(num == 1){
                answer += "w";
            } else if (num == -1){
                answer += "s";
            } else if (num == 10){
                answer += "d";
            } else if (num == -10){
                answer += "a";
            }
        }
        return answer;
    }
}