package Programmers;

/* 문자열 섞기 */
public class Solution_36 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(a, b, included));
    }

    static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int start = a;
        int[] includedNumber = new int[included.length];
        includedNumber[0] = start;
        for(int i=1; i<included.length; i++){
            includedNumber[i] = start+d;
            start = start+d;
        }
        for(int k=0; k<included.length; k++){
            if(included[k] == true){
                answer += includedNumber[k];
            }
        }
        return answer;
    }
}