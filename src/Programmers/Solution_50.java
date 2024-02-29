package Programmers;

/* 숫자 찾기 */
public class Solution_50 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));
    }

    static int solution(int num, int k) {
        int answer = 0;
        String[] array = String.valueOf(num).split("");
        for(int i=0; i<array.length; i++){
            if(Integer.parseInt(array[i]) == k){
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}