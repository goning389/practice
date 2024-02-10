package Programmers;
import java.util.*;

/* 문자열 다루기 기본 */
public class Solution_11 {
    public static void main(String[] args) {
        String s = "a234";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;
        int chk = 0;
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                chk = (int)s.charAt(i);
                if(chk < 48 || chk > 57){ //문자열
                    answer = false;
                    break;
                } else {
                    answer = true;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }
}
