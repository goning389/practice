package Programmers;

/* 주사위 게임 2 */
public class Solution_48 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;
        System.out.println(solution(a,b,c));
    }

    static int solution(int a, int b, int c) {
        int answer = 0;
        int check = 0;
        if(a == b && a == c){
            check = 2;
        } else if (a == b || a == c || b == c){
            check = 1;
        }
        if(check == 0){
            answer = a+b+c;
        } else if (check == 1){
            answer = (a+b+c)*(a*a+b*b+c*c);
        } else {
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
        return answer;
    }
}