package Programmers;

/* 중복된 문자 제거 */
public class Solution_33 {
    public static void main(String[] args) {
        String solution = "people";
        System.out.println(solution(solution));
    }

    static String solution(String my_string) {
        String answer = "";
        String[] array = my_string.split("");
        for(int i=0; i<array.length; i++){
            if(answer.indexOf(array[i]) == -1){
                answer += array[i];
            }
        }
        return answer;
    }
}