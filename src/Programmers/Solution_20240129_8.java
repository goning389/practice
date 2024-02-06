package Programmers;
import java.util.*;

/* 대소문자 바꿔서 출력하기 */
public class Solution_20240129_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i=0; i<a.length(); i++){
            int aToInt = (int)a.charAt(i);
            //아스키코드 비교 (대문자 65~90 소문자 97~122)
            if(aToInt >= 97 && aToInt <= 122){
                result += (char)(aToInt-32);
            } else {
                result += (char)(aToInt+32);
            }
        }
        System.out.println(result);
    }
}
