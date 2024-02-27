package Programmers;
import java.util.*;

/* 문자열 정렬하기 (2) */
public class Solution_46 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] array = my_string.split("");
        Arrays.sort(array); // 숫자 뿐만 아니라 문자열 정렬도 적용됨 기억!!!
        for(int i=0; i<array.length; i++){
            answer += array[i];
        }
        return answer;
    }
}