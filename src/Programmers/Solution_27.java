package Programmers;

/* 없는 숫자 더하기 */
public class Solution_27 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }

    static int solution(int[] numbers) {
        int sum = 0;
        int numbersSum = 0;
        for(int i=1; i<=9; i++){
            sum += i;
        }
        int answer = 0;
        int numbersCnt = numbers.length-1;
        for(int i=0; i<=numbersCnt; i++){
            numbersSum += numbers[i];
        }
        answer = sum - numbersSum;
        return answer;
    }
}