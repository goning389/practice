package Programmers;

/* 문자열 뒤집기 */
public class Solution_30 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        System.out.println(solution(my_string, s, e));
    }

    static String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        String[] array = my_string.split("");
        for(int i=e; i>=s; i--){
            answer += array[i];
        }
        for(int i=e+1; i<array.length; i++){
            answer += array[i];
        }
        return answer;
    }
}