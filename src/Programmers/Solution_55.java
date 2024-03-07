package Programmers;
import java.util.*;

/* 약수 구하기 */
public class Solution_55 {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(solution(n));
    }

    static int[] solution(int n) {
        String str = "";
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                str += i+",";
            }
        }
        String[] arr = str.split(",");
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}