package Programmers;

/* 문자열 섞기 */
public class Solution_35 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1, str2));
    }

    static String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++){
            answer += str1.charAt(i)+""+str2.charAt(i)+"";
        }
        return answer;
    }
}