package Programmers;

/* 1로 만들기 */
public class Solution_26 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};
        System.out.println(solution(num_list));
    }

    static int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            while(num_list[i] != 1){
                if(num_list[i]%2 == 0){
                    num_list[i] /= 2;
                } else{
                    num_list[i] -= 1;
                    num_list[i] /= 2;
                }
                answer++;
            }
        }
        return answer;
    }
}