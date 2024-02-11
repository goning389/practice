package Programmers;
import java.util.*;

/* 문자열 반복해서 출력하기 */
public class Solution_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String result = "";
        for(int i=0; i<n; i++){
            result += str;
        }
        System.out.println(result);
    }
}
