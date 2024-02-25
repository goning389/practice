package Programmers;

/* 자릿수 더하기 */
public class Solution_42 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;

        //test : 123
        while(n>0){
            answer += n%10; //3, 2, 1
            n/=10; //12, 1, 0
        }
        return answer;
    }
}