package Programmers;

import java.util.*;

/* K번째수 */
public class Solution_5 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(array, commands));
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            //Arrays.copyOf(원본배열, 복사할 길이);
            //Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사될 배열 요소의 바로 다음 인덱스);
            //즉, 두 번째 매개변수부터 세 번째 매개변수로 전달된 인덱스 바로 전의 배열 요소까지만 복사
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        System.out.println(Arrays.toString(answer));
        return answer;

        /*int[] commandsResult = new int[3];
        int[] answer = new int[3];
        int after = 0;
        int before = 0;
        int returnCnt = 0;
        int newCnt = 0;
        for(int i=0; i<commands.length; i++){
            for(int k=0; k<commands.length; k++){
                if(k==1){
                    after = commands[i][k];
                    newCnt = (after-before)+1;
                } else if(k==0){
                    before = commands[i][k];
                } else if(k==2){
                    returnCnt = commands[i][k];
                }
            }
            int[] arrayResult = new int[newCnt];
            int cnt = before-1;
            for(int h=0; h<newCnt; h++){
                arrayResult[h] = array[cnt];
                cnt++;
            }
            Arrays.sort(arrayResult);
            answer[i] = arrayResult[returnCnt-1];
        }
        return answer;*/
    }
}
