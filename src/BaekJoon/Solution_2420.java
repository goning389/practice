package BaekJoon;

import java.util.Scanner;

public class Solution_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long answer = Math.abs(n-m);

        System.out.println(answer);
    }
}
