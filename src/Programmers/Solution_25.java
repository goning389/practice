package Programmers;

/* k의 개수 */
public class Solution_25 {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i,j,k));
    }

    static int solution(int i, int j, int k) {
        int answer = 0;
        String kToString = String.valueOf(k);
        for(int p=i; p<=j; p++){
            String pToString = String.valueOf(p);
            answer += pToString.length()-pToString.replace(kToString,"").length();
        }
        return answer;
    }
}

/* 다른 사람 풀이 참고
String str = "";
for(int a = i; a <= j; a++) {
    str += a+"";
}

return str.length() - str.replace(k+"", "").length();
*/