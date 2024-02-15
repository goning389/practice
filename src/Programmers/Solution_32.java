package Programmers;

/* 날짜 비교하기 */
public class Solution_32 {
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        System.out.println(solution(date1, date2));
    }

    static int solution(int[] date1, int[] date2) {
        int answer = 0;
        if(date1[0] < date2[0]){
            answer = 1;
        } else if(date1[0] == date2[0]){
            if(date1[1] < date2[1]){
                answer = 1;
            } else if (date1[1] == date2[1]){
                if(date1[2] < date2[2]){
                    answer = 1;
                } else {
                    answer = 0;
                }
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}