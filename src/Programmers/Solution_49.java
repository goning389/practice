package Programmers;

/* 9로 나눈 나머지 */
public class Solution_49 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        System.out.println(solution(number));
    }

    static int solution(String number) {
        int answer = 0;
        int numberLength = number.length();
        int numberSum = 0;
        for(int i=0; i<numberLength; i++){
            numberSum += Integer.parseInt(number.charAt(i)+"");
        }
        answer = numberSum%9;
        return answer;
    }
}