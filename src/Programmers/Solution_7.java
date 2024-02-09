package Programmers;

/* 삼총사 */
public class Solution_7 {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number));
    }

    static int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length-2; i++){
            for(int k=i+1; k<number.length-1; k++){
                for(int s=k+1; s<number.length; s++){
                    if(number[i]+number[k]+number[s] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
