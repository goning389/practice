package Programmers;

import java.util.Arrays;

/* 2016년 */
public class Solution_20240129_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a, b));
    }

    static String solution(int a, int b) {
        String answer = "";
        String weeks [] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int months [] = {0,31,29,31,30,31,30,31,31,30,31,30,31};

        //int month;
        int sum = 0;

        for(int i=0; i<a; i++){
            sum += months[i]; //월
        }

        int date = sum+b; //일

        switch(date%7){
            case(0):answer = weeks[4]; break;
            case(1):answer = weeks[5]; break;
            case(2):answer = weeks[6]; break;
            case(3):answer = weeks[0]; break;
            case(4):answer = weeks[1]; break;
            case(5):answer = weeks[2]; break;
            case(6):answer = weeks[3]; break;
        }

        return answer;
    }
}
