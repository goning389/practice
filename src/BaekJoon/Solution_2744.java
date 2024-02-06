package BaekJoon;

import java.util.Scanner;

public class Solution_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";
        for(int i=0; i<word.length(); i++){
            String wordStr = String.valueOf(word.charAt(i));
            if(Character.isUpperCase(word.charAt(i))){
                result += wordStr.toLowerCase();
            } else {
                result += wordStr.toUpperCase();
            }
        }
        System.out.println(result);
    }
}
