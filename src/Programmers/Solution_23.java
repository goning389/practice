package Programmers;

import java.util.Arrays;

/* 숨어있는 숫자의 덧셈 (2) */
public class Solution_23 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[^0-9]+");
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}
