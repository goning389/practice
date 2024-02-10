package Programmers;

/* 문자열 겹쳐쓰기 */
public class Solution_10 {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        System.out.println(solution(my_string, overwrite_string, s));
    }

    static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String str1 = my_string.substring(0,s);
        int cnt = my_string.length()-(s+overwrite_string.length());
        String str2 = my_string.substring(my_string.length()-cnt, my_string.length());
        answer = str1+overwrite_string+str2;
        return answer;
    }
}
