package Programmers;
import java.util.*;

/* 자연수 뒤집어 배열로 만들기 */
public class Solution_41 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }

    static int[] solution(long n) {
        String[] nToString = String.valueOf(n).split("");
        int[] answer = new int[nToString.length];
        int index = 0;
        for(int i=answer.length-1; i>=0; i--){
            answer[index] = Integer.parseInt(nToString[i]);
            index++;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}