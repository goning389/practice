package Programmers;

/* 숫자 문자열과 영단어 */
public class Solution_6 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }

    static int solution(String s) {

        String[] num= {"0","1","2","3","4","5","6","7","8","9"};
        String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        for (int i = 0 ; i <10 ; i++){
            s = s.replace(word[i] , num[i]);
        }
        return Integer.parseInt(s);
    }
}
