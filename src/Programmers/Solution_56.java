package Programmers;

import java.util.*;

/* 직각삼각형 출력하기 */
public class Solution_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}