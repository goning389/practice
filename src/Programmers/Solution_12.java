package Programmers;
import java.math.*;

/* 두 수의 합 */
public class Solution_12 {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        System.out.println(solution(a,b));
    }

    static String solution(String a, String b) {
        String answer = "";
        BigInteger a2 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        BigInteger sum = a2.add(b2);
        answer = sum.toString();
        return answer;
    }
}
