package Programmers;

/* 나머지가 1이 되는 수 찾기 */
public class Solution_44 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}