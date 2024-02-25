package Programmers;

import java.util.Arrays;
import java.util.Collections;

/* 문자열 내 p와 y의 개수 */
public class Solution_40 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;
        String chk = "";
        int cntP = 0;
        int cntY = 0;
        for(int i=0; i<s.length(); i++){
            chk = s.substring(i,i+1);
            if(chk.indexOf("p") != -1 || chk.indexOf("P") != -1){
                cntP++;
            } else if(chk.indexOf("y") != -1 || chk.indexOf("Y") != -1){
                cntY++;
            }
        }
        if(cntP == cntY || (cntP == 0 && cntY == 0)){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}