package Programmers;

/* 합성수 찾기 */
public class Solution_37 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int k=1; k<=i; k++){
                if(i%k == 0){
                    cnt++;
                }
            }
            if(cnt > 2){
                answer++;
            }
        }
        return answer;
    }
}