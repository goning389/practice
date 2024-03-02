package Programmers;

/* 외계행성의 나이 */
public class Solution_52 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }

    static String solution(int age) {
        String answer = "";
        String str = "abcdefghij";
        String[] arr = str.split("");
        String ageToStr = String.valueOf(age);
        for(int i=0; i<ageToStr.length(); i++){
            int index = ageToStr.charAt(i)-'0';
            answer += arr[index];
        }
        return answer;
    }
}