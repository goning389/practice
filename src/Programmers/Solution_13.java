package Programmers;

import java.math.BigInteger;

/* 두 수의 합 */
public class Solution_13 {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers));
    }

    static long solution(String numbers) {
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        // String to Long
        long answer = Long.parseLong(numbers);
        return answer;
    }
}
