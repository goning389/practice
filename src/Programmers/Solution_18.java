package Programmers;
import java.util.*;

/* 7의 개수 */
public class Solution_18 {
    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        System.out.println(solution(array));
    }

    static int solution(int[] array) {
        int answer = 0;
        String arrayToString = Arrays.toString(array);
        for(int i=0; i<arrayToString.length(); i++){
            if(arrayToString.charAt(i) == '7'){
                answer++;
            }
        }
        return answer;
    }
}
