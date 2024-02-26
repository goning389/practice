package Programmers;

/* 약수의 합 */
public class Solution_43 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}