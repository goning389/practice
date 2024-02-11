package Programmers;
import java.util.*;

/* 잘라서 배열로 저장하기 */
public class Solution_15 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(solution(my_str, n));
    }

    static String[] solution(String my_str, int n) {
        String[] answer = {};
        String[] arr = my_str.split("");
        String str = "";
        for(int i=0; i<arr.length; i++){
            if((i+1)%n == 0){
                str += arr[i]+",";
            } else {
                str += arr[i];
            }
        }
        answer = str.split(",");
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
