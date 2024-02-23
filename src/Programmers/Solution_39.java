package Programmers;
import java.util.*;

/* 정수 내림차순으로 배치하기 */
public class Solution_39 {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

    static long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());


        /*
            String으로 담는 방법 vs StringBuffer로 담는 방법
        */
        String test = ""; //String 버전 해결
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
            test+=arr[i]; //String 버전 해결
        }

        //long answer = Long.parseLong(sb.toString());
        long answer = Long.parseLong(test); //String 버전 해결
        return answer;
    }
}