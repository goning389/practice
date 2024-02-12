package Programmers;

/* 핸드폰 번호 가리기 */
public class Solution_24 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }

    static String solution(String phone_number) {
        String number = "";
        String star = "";
        String answer = "";
        int cnt2 = phone_number.length();
        int cnt1 = cnt2-4;
        number = phone_number.substring(cnt1, cnt2);
        star = phone_number.substring(0, cnt1);
        star = star.replaceAll("[0-9]", "*");
        answer = star+number;
        return answer;
    }
}
