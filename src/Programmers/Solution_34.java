package Programmers;

/* 두 정수 사이의 합 */
public class Solution_34 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a, b));
    }

    static long solution(int a, int b) {
        long answer = 0;
        int cnt = 0;
        if(a>b){ //a가 더 클 때
            cnt = a-b;
            answer = b;
            for(int i=0; i<cnt; i++){
                b++;
                answer += b;
            }
        } else if(a<b){ //b가 더 클 때
            cnt = b-a;
            answer = a;
            for(int i=0; i<cnt; i++){
                a++;
                answer += a;
            }
        } else{ //a와 b가 같을 때
            answer = a;
        }
        return answer;
    }
}