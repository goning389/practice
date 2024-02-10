package Programmers;

/* 부족한 금액 계산하기 */
public class Solution_14 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution(price, money, count));
    }

    static long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;

        //놀이기구를 탄 횟수에 따른 비용의 합
        for(int i=1; i<=count; i++){
            totalPrice += price*i;
        }

        //비용의 합과 가진 돈과의 비교
        if(totalPrice > money){
            answer = totalPrice - money;
        } else {
            answer = 0;
        }
        return answer;
    }
}
