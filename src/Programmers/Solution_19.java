package Programmers;

import java.util.Arrays;

/* 가운데 글자 가져오기 */
public class Solution_19 {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));
    }

    static String solution(String s) {
        int chk = s.length();
        int cnt = chk/2;
        String answer = "";
        if(chk%2 != 0){ //단어 길이가 홀수일 때
            answer = s.substring(cnt,cnt+1);
        }else { //단어 길이가 짝수일 때
            answer = s.substring(cnt-1,cnt+1);
        }
        return answer;
    }
}
